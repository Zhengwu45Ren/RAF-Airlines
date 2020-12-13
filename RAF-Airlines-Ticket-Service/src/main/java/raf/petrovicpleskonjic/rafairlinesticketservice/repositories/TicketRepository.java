package raf.petrovicpleskonjic.rafairlinesticketservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import raf.petrovicpleskonjic.rafairlinesticketservice.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {}
