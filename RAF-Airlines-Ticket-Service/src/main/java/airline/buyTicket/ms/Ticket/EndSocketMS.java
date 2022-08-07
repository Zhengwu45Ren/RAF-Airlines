package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;

public final class EndSocketMS extends org.scribble.runtime.ms.EndMS<Ticket> {

	protected EndSocketMS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}
}