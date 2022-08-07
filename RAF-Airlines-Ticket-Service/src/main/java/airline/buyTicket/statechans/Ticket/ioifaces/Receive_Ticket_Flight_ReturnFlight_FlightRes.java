package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.*;

public interface Receive_Ticket_Flight_ReturnFlight_FlightRes<__Succ1 extends Succ_In_Flight_ReturnFlight_FlightRes> extends In_Flight_ReturnFlight_FlightRes<__Succ1>, Succ_Out_Flight_GetFlight_Long {
	public static final Receive_Ticket_Flight_ReturnFlight_FlightRes<?> cast = null;

	abstract public __Succ1 async(Flight role, ReturnFlight op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Ticket_Flight_ReturnFlight_FlightRes<?> to(Receive_Ticket_Flight_ReturnFlight_FlightRes<?> cast) {
		return (Receive_Ticket_Flight_ReturnFlight_FlightRes<?>) this;
	}

	default buyTicket_Ticket_4 to(buyTicket_Ticket_4 cast) {
		return (buyTicket_Ticket_4) this;
	}
}