package airline.buyTicket.statechans.User.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.User.*;

public interface Select_User_Ticket_ReturnUser_Long_String<__Succ1 extends Succ_Out_Ticket_ReturnUser_Long_String> extends Out_Ticket_ReturnUser_Long_String<__Succ1>, Succ_In_Ticket_GetUser_String {
	public static final Select_User_Ticket_ReturnUser_Long_String<?> cast = null;

	@Override
	default Select_User_Ticket_ReturnUser_Long_String<?> to(Select_User_Ticket_ReturnUser_Long_String<?> cast) {
		return (Select_User_Ticket_ReturnUser_Long_String<?>) this;
	}

	default buyTicket_User_2 to(buyTicket_User_2 cast) {
		return (buyTicket_User_2) this;
	}
}