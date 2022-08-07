package raf.petrovicpleskonjic.rafairlinesuserservice.utils;

import airline.buyTicket.ms.User.*;
import airline.buyTicket.ops.AddUserMileToUser;
import airline.buyTicket.ops.GetUser;
import airline.buyTicket.ops.ReturnUser;
import airline.buyTicket.roles.Ticket;
import airline.buyTicket.roles.User;
import org.scribble.runtime.session.MSEndpoint;
import org.scribble.runtime.util.Buf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    MSEndpoint<User> msEndpoint;

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

                        buyTicketUser1MS buyTicketUser1MS = new buyTicketUser1MS(msEndpoint);
                        buyTicketUser2MS buyTicketUser2MS =
                                buyTicketUser1MS.receive(Ticket.Ticket, GetUser.GetUser, stringBuf);
                        raf.petrovicpleskonjic.rafairlinesuserservice.models.User user = userRepo.findByEmail(stringBuf.val);
                        if (user == null)
                            return;
                        buyTicketUser3MS buyTicketUser3MS = buyTicketUser2MS.send(Ticket.Ticket, ReturnUser.ReturnUser, user.getUserId(), user.getName());
                        buyTicketUser3MS.receive(Ticket.Ticket, AddUserMileToUser.AddUserMileToUser, longBuf1, longBuf2, integerBuf);

                        Optional<raf.petrovicpleskonjic.rafairlinesuserservice.models.User> userOp = userRepo.findById(longBuf1.val);
                        if (!userOp.isPresent())
                            return;

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
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
