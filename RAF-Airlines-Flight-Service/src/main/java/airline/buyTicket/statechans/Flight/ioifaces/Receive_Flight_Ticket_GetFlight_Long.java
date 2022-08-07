package airline.buyTicket.statechans.Flight.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Flight.*;

public interface Receive_Flight_Ticket_GetFlight_Long<__Succ1 extends Succ_In_Ticket_GetFlight_Long> extends In_Ticket_GetFlight_Long<__Succ1> {
	public static final Receive_Flight_Ticket_GetFlight_Long<?> cast = null;

	abstract public __Succ1 async(Ticket role, GetFlight op) throws org.scribble.main.ScribRuntimeException;

	default buyTicket_Flight_1 to(buyTicket_Flight_1 cast) {
		return (buyTicket_Flight_1) this;
	}
}