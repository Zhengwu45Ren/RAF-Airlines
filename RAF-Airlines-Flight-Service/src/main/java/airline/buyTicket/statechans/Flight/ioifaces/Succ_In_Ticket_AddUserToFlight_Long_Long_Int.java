package airline.buyTicket.statechans.Flight.ioifaces;

import airline.buyTicket.statechans.Flight.EndSocket;

public interface Succ_In_Ticket_AddUserToFlight_Long_Long_Int {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}