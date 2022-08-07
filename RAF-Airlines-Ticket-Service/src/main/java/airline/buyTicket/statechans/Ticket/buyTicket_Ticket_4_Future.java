package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class buyTicket_Ticket_4_Future extends org.scribble.runtime.util.ScribFuture {
	public raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse pay1;

	protected buyTicket_Ticket_4_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public buyTicket_Ticket_4_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0];
		return this;
	}
}