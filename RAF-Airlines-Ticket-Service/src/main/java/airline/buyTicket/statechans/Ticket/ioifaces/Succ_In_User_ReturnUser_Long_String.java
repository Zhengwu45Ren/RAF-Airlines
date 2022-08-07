package airline.buyTicket.statechans.Ticket.ioifaces;

public interface Succ_In_User_ReturnUser_Long_String {

	default Select_Ticket_Flight_GetFlight_Long<?> to(Select_Ticket_Flight_GetFlight_Long<?> cast) {
		return (Select_Ticket_Flight_GetFlight_Long<?>) this;
	}
}