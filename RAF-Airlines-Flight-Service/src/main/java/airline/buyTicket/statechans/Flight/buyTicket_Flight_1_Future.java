package airline.buyTicket.statechans.Flight;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class buyTicket_Flight_1_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Long pay1;

	protected buyTicket_Flight_1_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public buyTicket_Flight_1_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Long) m.payload[0];
		return this;
	}
}