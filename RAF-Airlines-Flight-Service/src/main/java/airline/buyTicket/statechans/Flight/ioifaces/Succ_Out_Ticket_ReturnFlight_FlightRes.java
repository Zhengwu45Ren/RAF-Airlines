package airline.buyTicket.statechans.Flight.ioifaces;

public interface Succ_Out_Ticket_ReturnFlight_FlightRes {

	default Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?> to(Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?> cast) {
		return (Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?>) this;
	}
}