package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Receive_Ticket_User_ReturnUser_Long_String<__Succ1 extends Succ_In_User_ReturnUser_Long_String> extends In_User_ReturnUser_Long_String<__Succ1>, Succ_Out_User_GetUser_String {
	public static final Receive_Ticket_User_ReturnUser_Long_String<?> cast = null;

	abstract public __Succ1 async(User role, ReturnUser op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Ticket_User_ReturnUser_Long_String<?> to(Receive_Ticket_User_ReturnUser_Long_String<?> cast) {
		return (Receive_Ticket_User_ReturnUser_Long_String<?>) this;
	}

	default buyTicket_Ticket_2 to(buyTicket_Ticket_2 cast) {
		return (buyTicket_Ticket_2) this;
	}
}