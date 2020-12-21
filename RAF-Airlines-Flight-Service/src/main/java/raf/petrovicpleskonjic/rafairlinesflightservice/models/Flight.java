package raf.petrovicpleskonjic.rafairlinesflightservice.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flightId;
	
	@ManyToOne
	private Airplane airplane;
	
	@ManyToMany
	private List<Passenger> passengers;
	
	private String startDestination;
	private String endDestination;
	
	private Integer distance;
	
	private Float price;
	
	private Boolean canceled;
	
	public Flight() {}

	public Flight(Airplane airplane, String startDestination, String endDestination, Integer distance, Float price) {
		this.airplane = airplane;
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.distance = distance;
		this.price = price;
	}
	
	public Airplane getAirplane() {
		return airplane;
	}
	
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	
	public List<Passenger> getPassengers() {
		return passengers;
	}

	public String getStartDestination() {
		return startDestination;
	}

	public void setStartDestination(String startDestination) {
		this.startDestination = startDestination;
	}

	public String getEndDestination() {
		return endDestination;
	}

	public void setEndDestination(String endDestination) {
		this.endDestination = endDestination;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public long getFlightId() {
		return flightId;
	}
	
	public Boolean getCanceled() {
		return canceled;
	}
	
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
}
