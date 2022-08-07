package airline.buyTicket.ms.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicketTicket4MS extends org.scribble.runtime.ms.ReceiveMS<Ticket> {

	protected buyTicketTicket4MS(org.scribble.runtime.session.MSEndpoint<Ticket> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketTicket5MS receive(Flight role, ReturnFlight op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicket.Flight);
		arg1.val = (raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0];
		return new buyTicketTicket5MS(this.msEndpoint, true);
	}
}