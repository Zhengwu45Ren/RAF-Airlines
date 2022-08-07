package raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses;

import java.io.Serializable;

public class FlightResponse implements Serializable {

	private long flightId;
	
	private Integer distance;
	
	private String startDestination;
	private String endDestination;
	
	private Float price;
	
	private Boolean full;
	
	private Long airplaneId;
	
	public FlightResponse() {}
	
	public FlightResponse(long flightId, Integer distance, Float price, Boolean full, String startDestination, String endDestination, Long airplaneId) {
		this(flightId, distance, price, full);
		
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.airplaneId = airplaneId;
	}

	public FlightResponse(long flightId, Integer distance, Float price, Boolean full) {
		this.flightId = flightId;
		this.distance = distance;
		this.price = price;
		this.full = full;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
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
	
	public Boolean isFull() {
		return full;
	}
	
	public void setFull(Boolean full) {
		this.full = full;
	}
	
	public Long getAirplaneId() {
		return airplaneId;
	}
	
	public void setAirplaneId(Long airplaneId) {
		this.airplaneId = airplaneId;
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
}
