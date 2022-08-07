package airline.buyTicket.ms.Flight;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketFlight2MS extends org.scribble.runtime.ms.SendMS<Flight> {

	protected buyTicketFlight2MS(org.scribble.runtime.session.MSEndpoint<Flight> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketFlight3MS send(Ticket role, ReturnFlight op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicket.ReturnFlight, arg0);

		return new buyTicketFlight3MS(this.msEndpoint, true);
	}
}