package raf.petrovicpleskonjic.rafairlinesflightservice.utils;

import airline.buyTicket.ms.Flight.*;
import airline.buyTicket.ops.AddUserToFlight;
import airline.buyTicket.ops.GetFlight;
import airline.buyTicket.ops.ReturnFlight;
import airline.buyTicket.roles.Flight;
import airline.buyTicket.roles.Ticket;
import org.hibernate.Hibernate;
import org.scribble.runtime.session.MSEndpoint;
import org.scribble.runtime.util.Buf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import raf.petrovicpleskonjic.rafairlinesflightservice.models.Passenger;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.FlightRepository;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.PassengerRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class flightService {
    @Autowired
    MSEndpoint<Flight> msEndpoint;

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

                        buyTicketFlight1MS buyTicketFlight1MS = new buyTicketFlight1MS(msEndpoint);
                        buyTicketFlight2MS buyTicketFlight2MS = buyTicketFlight1MS.receive(Ticket.Ticket, GetFlight.GetFlight, longBuf1);
                        Optional<raf.petrovicpleskonjic.rafairlinesflightservice.models.Flight> flight = flightRepo.findById(longBuf1.val);

                        if (!flight.isPresent())
                            return;

                        Boolean isFull = flight.get().getPassengers().size() >= flight.get().getAirplane().getCapacity();

                        buyTicketFlight3MS buyTicketFlight3MS = buyTicketFlight2MS.send(Ticket.Ticket, ReturnFlight.ReturnFlight, new FlightResponse(longBuf1.val, flight.get().getDistance(),
                                flight.get().getPrice(), isFull, flight.get().getStartDestination(),
                                flight.get().getEndDestination(), flight.get().getAirplane().getAirplaneId()));
                        buyTicketFlight3MS.receive(Ticket.Ticket, AddUserToFlight.AddUserToFlight, longBuf1, longBuf2, integerBuf);

                        Passenger passenger = null;
                        if (passengerRepo.existsById(longBuf1.val))
                            passenger = passengerRepo.findById(longBuf1.val).get();
                        else
                            passenger = passengerRepo.save(new Passenger(longBuf1.val));

                        Hibernate.initialize(flight.get().getPassengers());
                        flight.get().getPassengers().add(passenger);
                        flightRepo.save(flight.get());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
