package raf.petrovicpleskonjic.rafairlinesflightservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import raf.petrovicpleskonjic.rafairlinesflightservice.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("SELECT f FROM Flight f WHERE f.passengers.size < f.airplane.capacity")
	List<Flight> getAvailableFlights();

	@Query("SELECT f FROM Flight f WHERE lower(f.airplane.name) LIKE lower(:airplaneName) "
			+ "OR lower(f.startDestination) LIKE lower(:startDestination) "
			+ "OR lower(f.endDestination) LIKE lower(:endDestination) "
			+ "OR f.distance == :distance OR f.price == :price")
	List<Flight> searchFlights(String airplaneName, String startDestination, String endDestination, Integer distance,
			Float price);
}
