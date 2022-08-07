package airline.buyTicket.statechans.Ticket.ioifaces;

public interface Succ_Out_Flight_GetFlight_Long {

	default Receive_Ticket_Flight_ReturnFlight_FlightRes<?> to(Receive_Ticket_Flight_ReturnFlight_FlightRes<?> cast) {
		return (Receive_Ticket_Flight_ReturnFlight_FlightRes<?>) this;
	}
}