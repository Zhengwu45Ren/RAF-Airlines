package raf.petrovicpleskonjic.rafairlinesticketservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import raf.petrovicpleskonjic.rafairlinesticketservice.forms.requests.NewTicketRequest;
import raf.petrovicpleskonjic.rafairlinesticketservice.forms.requests.PaymentRequest;
import raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse;
import raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.UserProfileResponse;
import raf.petrovicpleskonjic.rafairlinesticketservice.models.Flight;
import raf.petrovicpleskonjic.rafairlinesticketservice.models.Passenger;
import raf.petrovicpleskonjic.rafairlinesticketservice.models.Ticket;
import raf.petrovicpleskonjic.rafairlinesticketservice.repositories.FlightRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.repositories.PassengerRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.repositories.TicketRepository;
import raf.petrovicpleskonjic.rafairlinesticketservice.utils.UtilityMethods;

@RestController
@RequestMapping("")
public class Controller {

	private PassengerRepository passengerRepo;
	private TicketRepository ticketRepo;
	private FlightRepository flightRepo;

	@Autowired
	public Controller(PassengerRepository passengerRepo, TicketRepository ticketRepo, FlightRepository flightRepo) {
		this.passengerRepo = passengerRepo;
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

	@PostMapping("/buy-ticket")
	public ResponseEntity<Ticket> buyTicket(@RequestBody NewTicketRequest request,
			@RequestHeader(value = "Authorization") String token) {
		try {
			UriComponentsBuilder profileRequestBuilder = UriComponentsBuilder
					.fromHttpUrl(UtilityMethods.USER_SERVICE_URL + "my-profile");

			ResponseEntity<UserProfileResponse> response = UtilityMethods.sendGet(UserProfileResponse.class,
					profileRequestBuilder.toUriString(), token);

			if (response.getBody() == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			Passenger passenger = null;
			if (passengerRepo.existsById(response.getBody().getUserId()))
				passenger = passengerRepo.findById(response.getBody().getUserId()).get();
			else
				passenger = passengerRepo.save(new Passenger(response.getBody().getUserId()));

			if (!flightRepo.existsById(request.getFlightId()))
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			UriComponentsBuilder flightRequestBuilder = UriComponentsBuilder
					.fromHttpUrl(UtilityMethods.FLIGHT_SERVICE_URL + "get-flight-by-id")
					.queryParam("flightId", request.getFlightId());

			ResponseEntity<FlightResponse> flightResponse = UtilityMethods.sendGet(FlightResponse.class,
					flightRequestBuilder.toUriString(), token);

			if (flightResponse.getBody() == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			PaymentRequest paymentRequest = new PaymentRequest(request.getCreditCardNumber(),
					flightResponse.getBody().getPrice(), flightResponse.getBody().getDistance());

			ResponseEntity<Boolean> paymentResponse = UtilityMethods.sendPost(Boolean.class,
					UtilityMethods.USER_SERVICE_URL + "/credit-card/make-flight-payment", token, paymentRequest);

			if (!paymentResponse.getBody())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			Flight flight = flightRepo.save(new Flight(flightResponse.getBody().getFlightId()));
			Ticket ticket = ticketRepo.save(new Ticket(passenger, flight));
			
			// TODO: Dispatch flight to Flight service through message broker

			return new ResponseEntity<>(ticket, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
