package airline.buyTicket.statechans.Flight;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Flight.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicket, Flight> implements Succ_In_Ticket_AddUserToFlight_Long_Long_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicket, Flight> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}