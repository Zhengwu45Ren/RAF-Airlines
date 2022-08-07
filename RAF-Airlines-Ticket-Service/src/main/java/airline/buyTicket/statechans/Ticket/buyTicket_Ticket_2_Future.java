package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class buyTicket_Ticket_2_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Long pay1;
	public java.lang.String pay2;

	protected buyTicket_Ticket_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public buyTicket_Ticket_2_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Long) m.payload[0];
		this.pay2 = (java.lang.String) m.payload[1];
		return this;
	}
}