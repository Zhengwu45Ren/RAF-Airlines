package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket1MS extends org.scribble.runtime.ms.SendMS<Ticket> {

	protected buyTicketTicket1MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketTicket1MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketTicket2MS send(User role, GetUser op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.GetUser, arg0);

		return new buyTicketTicket2MS(this.msEndpoint, true);
	}
}