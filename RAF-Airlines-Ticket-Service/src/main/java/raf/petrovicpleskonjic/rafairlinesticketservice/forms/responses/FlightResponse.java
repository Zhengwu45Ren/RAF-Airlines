package raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses;

public class FlightResponse {

	private long flightId;
	
	private Integer distance;
	
	private Float price;
	
	public FlightResponse() {}

	public FlightResponse(long flightId, Integer distance, Float price) {
		this.flightId = flightId;
		this.distance = distance;
		this.price = price;
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
}
