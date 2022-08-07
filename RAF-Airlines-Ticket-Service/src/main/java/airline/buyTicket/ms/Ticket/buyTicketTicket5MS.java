package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket5MS extends org.scribble.runtime.ms.SendMS<Ticket> {

	protected buyTicketTicket5MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketTicket6MS send(Flight role, AddUserToFlight op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.AddUserToFlight, arg0, arg1, arg2);

		return new buyTicketTicket6MS(this.msEndpoint, true);
	}
}