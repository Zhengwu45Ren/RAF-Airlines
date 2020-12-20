package raf.petrovicpleskonjic.rafairlinesticketservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.UserProfileResponse;
import raf.petrovicpleskonjic.rafairlinesticketservice.models.Flight;
import raf.petrovicpleskonjic.rafairlinesticketservice.models.Ticket;
import raf.petrovicpleskonjic.rafairlinesticketservice.repositories.FlightRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.repositories.TicketRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.utils.UtilityMethods;


@RestController
@RequestMapping("")
public class Controller {
	
	private TicketRepository ticketRepo;
	private FlightRepository flightRepo;
	
	@Autowired
	public Controller(TicketRepository ticketRepo, FlightRepository flightRepo) {
		this.ticketRepo = ticketRepo;
		this.flightRepo = flightRepo;
	}

	@GetMapping("/get-my-flights")
	public ResponseEntity<List<Flight>> getMyFlights(@RequestHeader(value = "Authorization") String token) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder
					.fromHttpUrl(UtilityMethods.USER_SERVICE_URL + "my-profile");

			ResponseEntity<UserProfileResponse> response = UtilityMethods.sendGet(UserProfileResponse.class,
					builder.toUriString(), token);
			
			if (response.getBody() == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);	
			
			List<Flight> flights = flightRepo.getFlightsForPassenger(response.getBody().getUserId());

			return new ResponseEntity<>(flights, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/get-my-tickets")
	public ResponseEntity<List<Ticket>> getMyTickets(@RequestHeader(value = "Authorization") String token) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder
					.fromHttpUrl(UtilityMethods.USER_SERVICE_URL + "my-profile");

			ResponseEntity<UserProfileResponse> response = UtilityMethods.sendGet(UserProfileResponse.class,
					builder.toUriString(), token);
			
			if (response.getBody() == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
					
			List<Ticket> tickets = ticketRepo.getTicketsForPassenger(response.getBody().getUserId());

			return new ResponseEntity<>(tickets, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
//	@PostMapping("/buy-ticket")
	
}
