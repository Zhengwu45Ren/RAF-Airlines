package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket3MS extends org.scribble.runtime.ms.SendMS<Ticket> {

	protected buyTicketTicket3MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketTicket4MS send(Flight role, GetFlight op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.GetFlight, arg0);

		return new buyTicketTicket4MS(this.msEndpoint, true);
	}
}