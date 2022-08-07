package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket2MS extends org.scribble.runtime.ms.ReceiveMS<Ticket> {

	protected buyTicketTicket2MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketTicket3MS receive(User role, ReturnUser op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicket.User);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.String) m.payload[1];
		return new buyTicketTicket3MS(this.msEndpoint, true);
	}
}