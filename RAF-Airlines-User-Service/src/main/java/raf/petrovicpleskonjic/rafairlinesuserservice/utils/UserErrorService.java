package raf.petrovicpleskonjic.rafairlinesuserservice.utils;

import air.buyTicketError.ms.U.*;
import air.buyTicketError.ops.AddUMileToU;
import air.buyTicketError.ops.ErrorThrow;
import air.buyTicketError.ops.GetU;
import air.buyTicketError.ops.ReturnU;
import air.buyTicketError.roles.*;
import org.scribble.runtime.session.MSEndpoint;
import org.scribble.runtime.util.Buf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.User;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class UserErrorService {
    @Autowired
    MSEndpoint<U> msEndpointU;

    @Autowired
    UserRepository userRepo;

    @Autowired
    private EmailService emailService;

    @PostConstruct
    public void buyService(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                while(true) {
                    try {
                        Buf<Long> longBuf1 = new Buf<>();
                        Buf<Long> longBuf2 = new Buf<>();
                        Buf<Integer> integerBuf = new Buf<>();
                        Buf<String> stringBuf = new Buf<>();

                        buyTicketErrorU1MS buyTicketErrorU1MS = new buyTicketErrorU1MS(msEndpointU);
                        buyTicketErrorU2MS buyTicketErrorU2MS =
                                buyTicketErrorU1MS.receive(T.T, GetU.GetU, stringBuf);
                        User user = userRepo.findByEmail(stringBuf.val);
                        if(user == null){
                            buyTicketErrorU2MS.send(T.T, ErrorThrow.ErrorThrow, "User Does Not Exist");
                            continue;
                        }
                        buyTicketErrorU3MS buyTicketErrorU3MS = buyTicketErrorU2MS.send(T.T, ReturnU.ReturnU, user.getUserId(), user.getName());
                        buyTicketErrorU3MSCases buyTicketErrorU3MSCases = buyTicketErrorU3MS.branch(T.T);
                        switch (buyTicketErrorU3MSCases.op){
                            case ErrorThrow:{
                                continue;
                            }
                            case AddUMileToU:{
                                buyTicketErrorU3MSCases.receive(AddUMileToU.AddUMileToU, longBuf1, longBuf2, integerBuf);
                                Optional<User> userOp = userRepo.findById(longBuf1.val);
                                if (!userOp.isPresent())
                                    continue;

                                userOp.get().setMiles(userOp.get().getMiles() + integerBuf.val);

                                userRepo.save(userOp.get());

                                StringBuilder body = new StringBuilder();
                                body.append("Hello, ");
                                body.append(user.getName());
                                body.append("!\n\n");
                                body.append("We're sending this message to let you know that your flight #");
                                body.append(longBuf2.val);
                                body.append(" has been booked successfully.\n");
                                body.append("Hope you have a great journey!\n\nSincerely,\nRAF Airlines");

                                emailService.sendSimpleMessage(stringBuf.val, "Successfully booked a flight!", body.toString());
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
