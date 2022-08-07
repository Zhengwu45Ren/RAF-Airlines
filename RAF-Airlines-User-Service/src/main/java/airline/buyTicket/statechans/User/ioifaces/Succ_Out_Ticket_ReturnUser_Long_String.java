package airline.buyTicket.statechans.User.ioifaces;

public interface Succ_Out_Ticket_ReturnUser_Long_String {

	default Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?> to(Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?> cast) {
		return (Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?>) this;
	}
}