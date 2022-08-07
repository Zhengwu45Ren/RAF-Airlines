package airline.buyTicket.statechans.Flight;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Flight.ioifaces.*;

public final class buyTicket_Flight_3 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicket, Flight> implements Receive_Flight_Ticket_AddUserToFlight_Long_Long_Int<EndSocket> {
	public static final buyTicket_Flight_3 cast = null;

	protected buyTicket_Flight_3(org.scribble.runtime.session.SessionEndpoint<buyTicket, Flight> se, boolean dummy) {
		super(se);
	}

	public airline.buyTicket.statechans.Flight.EndSocket receive(Ticket role, AddUserToFlight op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicket.Ticket);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public airline.buyTicket.statechans.Flight.EndSocket async(Ticket role, AddUserToFlight op, org.scribble.runtime.util.Buf<buyTicket_Flight_3_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicket_Flight_3_Future(super.getFuture(buyTicket.Ticket));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicket.Ticket);
	}

	@SuppressWarnings("unchecked")
	public airline.buyTicket.statechans.Flight.EndSocket async(Ticket role, AddUserToFlight op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicket.Ticket, op, (org.scribble.runtime.util.Buf<buyTicket_Flight_3_Future>) this.se.gc);
	}
}