package airline.buyTicket.statechans.Ticket.ioifaces;

public interface Succ_In_Flight_ReturnFlight_FlightRes {

	default Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?> to(Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?> cast) {
		return (Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?>) this;
	}
}