package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket6MS extends org.scribble.runtime.ms.SendMS<Ticket> {

	protected buyTicketTicket6MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public airline.buyTicket.ms.Ticket.EndSocketMS send(User role, AddUserMileToUser op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.AddUserMileToUser, arg0, arg1, arg2);

		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}