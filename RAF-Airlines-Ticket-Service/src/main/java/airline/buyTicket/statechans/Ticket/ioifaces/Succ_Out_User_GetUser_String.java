package airline.buyTicket.statechans.Ticket.ioifaces;

public interface Succ_Out_User_GetUser_String {

	default Receive_Ticket_User_ReturnUser_Long_String<?> to(Receive_Ticket_User_ReturnUser_Long_String<?> cast) {
		return (Receive_Ticket_User_ReturnUser_Long_String<?>) this;
	}
}