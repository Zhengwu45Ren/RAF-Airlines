package airline.buyTicket.statechans.User;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class buyTicket_User_3_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Long pay1;
	public java.lang.Long pay2;
	public java.lang.Integer pay3;

	protected buyTicket_User_3_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public buyTicket_User_3_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Long) m.payload[0];
		this.pay2 = (java.lang.Long) m.payload[1];
		this.pay3 = (java.lang.Integer) m.payload[2];
		return this;
	}
}