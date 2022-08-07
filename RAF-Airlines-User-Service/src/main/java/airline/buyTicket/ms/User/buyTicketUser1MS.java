package airline.buyTicket.ms.User;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketUser1MS extends org.scribble.runtime.ms.ReceiveMS<User> {

	protected buyTicketUser1MS(org.scribble.runtime.session.MSEndpoint<User> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketUser1MS(org.scribble.runtime.session.MSEndpoint<User> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketUser2MS receive(Ticket role, GetUser op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicket.Ticket);
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketUser2MS(this.msEndpoint, true);
	}
}