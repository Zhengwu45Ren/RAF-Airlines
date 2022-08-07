package airline.buyTicket.statechans.Flight.ioifaces;

public interface Succ_In_Ticket_GetFlight_Long {

	default Select_Flight_Ticket_ReturnFlight_FlightRes<?> to(Select_Flight_Ticket_ReturnFlight_FlightRes<?> cast) {
		return (Select_Flight_Ticket_ReturnFlight_FlightRes<?>) this;
	}
}