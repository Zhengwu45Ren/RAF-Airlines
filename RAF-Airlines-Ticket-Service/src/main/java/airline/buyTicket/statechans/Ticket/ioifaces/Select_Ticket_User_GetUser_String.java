package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Select_Ticket_User_GetUser_String<__Succ1 extends Succ_Out_User_GetUser_String> extends Out_User_GetUser_String<__Succ1> {
	public static final Select_Ticket_User_GetUser_String<?> cast = null;

	default buyTicket_Ticket_1 to(buyTicket_Ticket_1 cast) {
		return (buyTicket_Ticket_1) this;
	}
}