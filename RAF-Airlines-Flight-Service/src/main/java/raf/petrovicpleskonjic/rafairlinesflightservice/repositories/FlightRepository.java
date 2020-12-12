package raf.petrovicpleskonjic.rafairlinesflightservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import raf.petrovicpleskonjic.rafairlinesflightservice.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {}
