package airline.buyTicket.ms.Flight;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;

public final class EndSocketMS extends org.scribble.runtime.ms.EndMS<Flight> {

	protected EndSocketMS(org.scribble.runtime.session.MSEndpoint<Flight> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}
}