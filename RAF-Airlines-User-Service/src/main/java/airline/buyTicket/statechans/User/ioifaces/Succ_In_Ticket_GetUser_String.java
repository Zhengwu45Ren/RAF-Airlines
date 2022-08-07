package airline.buyTicket.statechans.User.ioifaces;

public interface Succ_In_Ticket_GetUser_String {

	default Select_User_Ticket_ReturnUser_Long_String<?> to(Select_User_Ticket_ReturnUser_Long_String<?> cast) {
		return (Select_User_Ticket_ReturnUser_Long_String<?>) this;
	}
}