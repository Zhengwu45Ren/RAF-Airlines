package raf.petrovicpleskonjic.rafairlinesflightservice.forms.requests;

public class FindFlightRequest {
	
	private String airplaneName;
	private String startDestination;
	private String endDestination;
	
	private Integer distance;
	
	private Float price;

	public FindFlightRequest(String airplaneName, String startDestination, String endDestination, Integer distance,
			Float price) {
		this.airplaneName = airplaneName;
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.distance = distance;
		this.price = price;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
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
}
