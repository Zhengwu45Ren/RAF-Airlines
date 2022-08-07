package airline.buyTicket.statechans.Flight;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Flight.ioifaces.*;

public final class buyTicket_Flight_1 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicket, Flight> implements Receive_Flight_Ticket_GetFlight_Long<buyTicket_Flight_2> {
	public static final buyTicket_Flight_1 cast = null;

	protected buyTicket_Flight_1(org.scribble.runtime.session.SessionEndpoint<buyTicket, Flight> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Flight_1(org.scribble.runtime.session.MPSTEndpoint<buyTicket, Flight> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public buyTicket_Flight_2 receive(Ticket role, GetFlight op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicket.Ticket);
		arg1.val = (java.lang.Long) m.payload[0];
		return new buyTicket_Flight_2(this.se, true);
	}

	public buyTicket_Flight_2 async(Ticket role, GetFlight op, org.scribble.runtime.util.Buf<buyTicket_Flight_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicket_Flight_1_Future(super.getFuture(buyTicket.Ticket));
		return new buyTicket_Flight_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicket.Ticket);
	}

	@SuppressWarnings("unchecked")
	public buyTicket_Flight_2 async(Ticket role, GetFlight op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicket.Ticket, op, (org.scribble.runtime.util.Buf<buyTicket_Flight_1_Future>) this.se.gc);
	}
}