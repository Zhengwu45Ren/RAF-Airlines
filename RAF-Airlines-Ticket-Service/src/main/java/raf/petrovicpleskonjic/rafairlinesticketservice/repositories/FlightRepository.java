package raf.petrovicpleskonjic.rafairlinesticketservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import raf.petrovicpleskonjic.rafairlinesticketservice.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {}
