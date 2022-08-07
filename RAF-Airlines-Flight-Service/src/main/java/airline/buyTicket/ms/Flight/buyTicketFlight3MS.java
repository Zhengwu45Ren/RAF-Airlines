package airline.buyTicket.ms.Flight;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketFlight3MS extends org.scribble.runtime.ms.ReceiveMS<Flight> {

	protected buyTicketFlight3MS(org.scribble.runtime.session.MSEndpoint<Flight> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public airline.buyTicket.ms.Flight.EndSocketMS receive(Ticket role, AddUserToFlight op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicket.Ticket);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}