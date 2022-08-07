package airline.buyTicket.statechans.User.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.User.*;

public interface Receive_User_Ticket_GetUser_String<__Succ1 extends Succ_In_Ticket_GetUser_String> extends In_Ticket_GetUser_String<__Succ1> {
	public static final Receive_User_Ticket_GetUser_String<?> cast = null;

	abstract public __Succ1 async(Ticket role, GetUser op) throws org.scribble.main.ScribRuntimeException;

	default buyTicket_User_1 to(buyTicket_User_1 cast) {
		return (buyTicket_User_1) this;
	}
}