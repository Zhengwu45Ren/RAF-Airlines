package airline.buyTicket.statechans.User.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.User.*;

public interface Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<__Succ1 extends Succ_In_Ticket_AddUserMileToUser_Long_Long_Int> extends In_Ticket_AddUserMileToUser_Long_Long_Int<__Succ1>, Succ_Out_Ticket_ReturnUser_Long_String {
	public static final Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?> cast = null;

	abstract public airline.buyTicket.statechans.User.EndSocket async(Ticket role, AddUserMileToUser op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?> to(Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?> cast) {
		return (Receive_User_Ticket_AddUserMileToUser_Long_Long_Int<?>) this;
	}

	default buyTicket_User_3 to(buyTicket_User_3 cast) {
		return (buyTicket_User_3) this;
	}
}