package raf.petrovicpleskonjic.rafairlinesticketservice.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketId;
	
	@ManyToOne
	private Passenger passenger;
	
	@ManyToOne
	private Flight flight;
	
	@CreatedDate
	private Date dayBought;
	
	private boolean canceled;
	
	public Ticket() {}

	public Ticket(Passenger passenger, Flight flight) {
		this.passenger = passenger;
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getTicketId() {
		return ticketId;
	}

	public Date getDayBought() {
		return dayBought;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
}
