package airline.buyTicket.ms.User;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketUser2MS extends org.scribble.runtime.ms.SendMS<User> {

	protected buyTicketUser2MS(org.scribble.runtime.session.MSEndpoint<User> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketUser3MS send(Ticket role, ReturnUser op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.ReturnUser, arg0, arg1);

		return new buyTicketUser3MS(this.msEndpoint, true);
	}
}