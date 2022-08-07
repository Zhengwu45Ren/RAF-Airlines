package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Select_Ticket_Flight_GetFlight_Long<__Succ1 extends Succ_Out_Flight_GetFlight_Long> extends Out_Flight_GetFlight_Long<__Succ1>, Succ_In_User_ReturnUser_Long_String {
	public static final Select_Ticket_Flight_GetFlight_Long<?> cast = null;

	@Override
	default Select_Ticket_Flight_GetFlight_Long<?> to(Select_Ticket_Flight_GetFlight_Long<?> cast) {
		return (Select_Ticket_Flight_GetFlight_Long<?>) this;
	}

	default buyTicket_Ticket_3 to(buyTicket_Ticket_3 cast) {
		return (buyTicket_Ticket_3) this;
	}
}