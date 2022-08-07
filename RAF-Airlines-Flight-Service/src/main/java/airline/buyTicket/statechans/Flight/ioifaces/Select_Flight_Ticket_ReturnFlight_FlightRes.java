package airline.buyTicket.statechans.Flight.ioifaces;

import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Flight.*;

public interface Select_Flight_Ticket_ReturnFlight_FlightRes<__Succ1 extends Succ_Out_Ticket_ReturnFlight_FlightRes> extends Out_Ticket_ReturnFlight_FlightRes<__Succ1>, Succ_In_Ticket_GetFlight_Long {
	public static final Select_Flight_Ticket_ReturnFlight_FlightRes<?> cast = null;

	@Override
	default Select_Flight_Ticket_ReturnFlight_FlightRes<?> to(Select_Flight_Ticket_ReturnFlight_FlightRes<?> cast) {
		return (Select_Flight_Ticket_ReturnFlight_FlightRes<?>) this;
	}

	default buyTicket_Flight_2 to(buyTicket_Flight_2 cast) {
		return (buyTicket_Flight_2) this;
	}
}