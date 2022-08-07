package airline.buyTicket.statechans.Flight.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Flight.*;

public interface Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<__Succ1 extends Succ_In_Ticket_AddUserToFlight_Long_Long_Int> extends In_Ticket_AddUserToFlight_Long_Long_Int<__Succ1>, Succ_Out_Ticket_ReturnFlight_FlightRes {
	public static final Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?> cast = null;

	abstract public airline.buyTicket.statechans.Flight.EndSocket async(Ticket role, AddUserToFlight op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?> to(Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?> cast) {
		return (Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<?>) this;
	}

	default buyTicket_Flight_3 to(buyTicket_Flight_3 cast) {
		return (buyTicket_Flight_3) this;
	}
}