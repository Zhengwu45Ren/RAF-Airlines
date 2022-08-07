package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Select_Ticket_User_AddUserMileToUser_Long_Long_Int<__Succ1 extends Succ_Out_User_AddUserMileToUser_Long_Long_Int> extends Out_User_AddUserMileToUser_Long_Long_Int<__Succ1>, Succ_Out_Flight_AddUserToFlight_Long_Long_Int {
	public static final Select_Ticket_User_AddUserMileToUser_Long_Long_Int<?> cast = null;

	@Override
	default Select_Ticket_User_AddUserMileToUser_Long_Long_Int<?> to(Select_Ticket_User_AddUserMileToUser_Long_Long_Int<?> cast) {
		return (Select_Ticket_User_AddUserMileToUser_Long_Long_Int<?>) this;
	}

	default buyTicket_Ticket_6 to(buyTicket_Ticket_6 cast) {
		return (buyTicket_Ticket_6) this;
	}
}