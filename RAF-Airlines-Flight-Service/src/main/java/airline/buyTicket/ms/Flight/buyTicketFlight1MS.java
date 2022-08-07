package airline.buyTicket.ms.Flight;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketFlight1MS extends org.scribble.runtime.ms.ReceiveMS<Flight> {

	protected buyTicketFlight1MS(org.scribble.runtime.session.MSEndpoint<Flight> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketFlight1MS(org.scribble.runtime.session.MSEndpoint<Flight> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketFlight2MS receive(Ticket role, GetFlight op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicket.Ticket);
		arg1.val = (java.lang.Long) m.payload[0];
		return new buyTicketFlight2MS(this.msEndpoint, true);
	}
}