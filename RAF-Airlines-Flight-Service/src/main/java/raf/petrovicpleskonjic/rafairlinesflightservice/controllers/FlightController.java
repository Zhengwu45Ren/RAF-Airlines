package raf.petrovicpleskonjic.rafairlinesflightservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import raf.petrovicpleskonjic.rafairlinesflightservice.forms.requests.FindFlightRequest;
import raf.petrovicpleskonjic.rafairlinesflightservice.forms.requests.NewFlightRequest;
import raf.petrovicpleskonjic.rafairlinesflightservice.forms.responses.UserProfileResponse;
import raf.petrovicpleskonjic.rafairlinesflightservice.models.Airplane;
import raf.petrovicpleskonjic.rafairlinesflightservice.models.Flight;
import raf.petrovicpleskonjic.rafairlinesflightservice.models.Passenger;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.AirplaneRepository;
import raf.petrovicpleskonjic.rafairlinesflightservice.repositories.FlightRepository;
import raf.petrovicpleskonjic.rafairlinesflightservice.utils.UtilityMethods;

@RestController
@RequestMapping("/flight")
public class FlightController {

	private FlightRepository flightRepo;
	private AirplaneRepository airplaneRepo;

	@Autowired
	public FlightController(FlightRepository flightRepo, AirplaneRepository airplaneRepo) {
		this.flightRepo = flightRepo;
		this.airplaneRepo = airplaneRepo;
	}

	@GetMapping("/get-available")
	public ResponseEntity<List<Flight>> getAvailableFlights() {
		try {
			List<Flight> flights = flightRepo.getAvailableFlights();

			return new ResponseEntity<>(flights, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/search")
	public ResponseEntity<List<Flight>> searchFlights(@RequestBody FindFlightRequest request) {
		try {
			List<Flight> flights = flightRepo.searchFlights(request.getAirplaneName(), request.getStartDestination(),
					request.getEndDestination(), request.getDistance(), request.getPrice());

			return new ResponseEntity<>(flights, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Flight> addFlight(@RequestBody NewFlightRequest request,
			@RequestHeader(value = "Authorization") String token) {
		try {
			ResponseEntity<Boolean> isAdmin = UtilityMethods.sendGet(Boolean.class,
					UtilityMethods.USER_SERVICE_URL + "admin-verification", token);

			if (!isAdmin.getBody())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			Optional<Airplane> airplane = airplaneRepo.findById(request.getAirplaneId());
			if (!airplane.isPresent())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			Flight flight = new Flight(airplane.get(), request.getStartDestination(), request.getEndDestination(),
					request.getDistance(), request.getPrice());

			flightRepo.saveAndFlush(flight);
			return new ResponseEntity<>(flight, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteFlight(@RequestParam Long flightId,
			@RequestHeader(value = "Authorization") String token) {
		try {
			ResponseEntity<Boolean> isAdmin = UtilityMethods.sendGet(Boolean.class,
					UtilityMethods.USER_SERVICE_URL + "admin-verification", token);

			if (!isAdmin.getBody())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			Optional<Flight> flight = flightRepo.findById(flightId);
			if (!flight.isPresent())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			if (!flight.get().getPassengers().isEmpty()) {
				for (Passenger passenger : flight.get().getPassengers()) {
					
					UriComponentsBuilder builder = UriComponentsBuilder
							.fromHttpUrl(UtilityMethods.USER_SERVICE_URL + "profile-by-id")
							.queryParam("userId", passenger.getPassengerId());

					ResponseEntity<UserProfileResponse> response = UtilityMethods.sendGet(UserProfileResponse.class,
							builder.toUriString(), token);

					String email = response.getBody().getEmail();

					// TODO: Send email about returned funds
					System.out.println("Money returned to " + email);
				}
			}

			flightRepo.delete(flight.get());
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
