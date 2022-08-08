package raf.petrovicpleskonjic.rafairlinesflightservice.utils;

import air.buyTicketError.ms.F.*;
import air.buyTicketError.ops.AddUToF;
import air.buyTicketError.ops.ErrorThrow;
import air.buyTicketError.ops.GetF;
import air.buyTicketError.ops.ReturnF;
import air.buyTicketError.roles.F;
import air.buyTicketError.roles.T;
import airline.buyTicket.ms.Flight.buyTicketFlight1MS;
import airline.buyTicket.ms.Flight.buyTicketFlight2MS;
import airline.buyTicket.ms.Flight.buyTicketFlight3MS;
import airline.buyTicket.ops.AddUserToFlight;
import airline.buyTicket.ops.GetFlight;
import airline.buyTicket.ops.ReturnFlight;
import airline.buyTicket.roles.Flight;
import airline.buyTicket.roles.Ticket;
import org.hibernate.Hibernate;
import org.scribble.runtime.session.MSEndpoint;
import org.scribble.runtime.util.Buf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import raf.petrovicpleskonjic.rafairlinesflightservice.models.Passenger;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.FlightRepository;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.PassengerRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class FlightErrorService {
    @Autowired
    MSEndpoint<F> msEndpointF;

    @Autowired
    FlightRepository flightRepo;

    @Autowired
    PassengerRepository passengerRepo;

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

                        buyTicketErrorF1MS buyTicketErrorF1MS = new buyTicketErrorF1MS(msEndpointF);
                        buyTicketErrorF1MSCases buyTicketErrorF1MSCases = buyTicketErrorF1MS.branch(T.T);
                        switch (buyTicketErrorF1MSCases.op){
                            case ErrorThrow:{
                                continue;
                            }
                            case GetF:{
                                buyTicketErrorF2MS buyTicketErrorF2MS = buyTicketErrorF1MSCases.receive(GetF.GetF, longBuf1);
                                Optional<raf.petrovicpleskonjic.rafairlinesflightservice.models.Flight> flight = flightRepo.findById(longBuf1.val);
                                if (!flight.isPresent()) {
                                    buyTicketErrorF2MS.send(T.T, ErrorThrow.ErrorThrow, "Flight Does Not Exist");
                                    continue;
                                }
                                Boolean isFull = flight.get().getPassengers().size() >= flight.get().getAirplane().getCapacity();
                                buyTicketErrorF3MS buyTicketErrorF3MS = buyTicketErrorF2MS.send(T.T, ReturnF.ReturnF, new FlightResponse(longBuf1.val, flight.get().getDistance(),
                                        flight.get().getPrice(), isFull, flight.get().getStartDestination(),
                                        flight.get().getEndDestination(), flight.get().getAirplane().getAirplaneId()));
                                buyTicketErrorF3MS.receive(T.T, AddUToF.AddUToF, longBuf1, longBuf2, integerBuf);
                                Passenger passenger = null;
                                if (passengerRepo.existsById(longBuf1.val))
                                    passenger = passengerRepo.findById(longBuf1.val).get();
                                else
                                    passenger = passengerRepo.save(new Passenger(longBuf1.val));

                                Hibernate.initialize(flight.get().getPassengers());
                                flight.get().getPassengers().add(passenger);
                                flightRepo.save(flight.get());
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
