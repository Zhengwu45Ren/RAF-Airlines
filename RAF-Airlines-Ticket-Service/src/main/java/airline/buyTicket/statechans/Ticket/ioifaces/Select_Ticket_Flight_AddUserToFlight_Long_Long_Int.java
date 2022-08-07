package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<__Succ1 extends Succ_Out_Flight_AddUserToFlight_Long_Long_Int> extends Out_Flight_AddUserToFlight_Long_Long_Int<__Succ1>, Succ_In_Flight_ReturnFlight_FlightRes {
	public static final Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?> cast = null;

	@Override
	default Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?> to(Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?> cast) {
		return (Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<?>) this;
	}

	default buyTicket_Ticket_5 to(buyTicket_Ticket_5 cast) {
		return (buyTicket_Ticket_5) this;
	}
}