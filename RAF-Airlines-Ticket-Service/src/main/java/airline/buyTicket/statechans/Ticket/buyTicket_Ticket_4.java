package airline.buyTicket.statechans.Ticket;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_4 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicket, Ticket> implements Receive_Ticket_Flight_ReturnFlight_FlightRes<buyTicket_Ticket_5> {
	public static final buyTicket_Ticket_4 cast = null;

	protected buyTicket_Ticket_4(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Ticket_5 receive(Flight role, ReturnFlight op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicket.Flight);
		arg1.val = (raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0];
		return new buyTicket_Ticket_5(this.se, true);
	}

	public buyTicket_Ticket_5 async(Flight role, ReturnFlight op, org.scribble.runtime.util.Buf<buyTicket_Ticket_4_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicket_Ticket_4_Future(super.getFuture(buyTicket.Flight));
		return new buyTicket_Ticket_5(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicket.Flight);
	}

	@SuppressWarnings("unchecked")
	public buyTicket_Ticket_5 async(Flight role, ReturnFlight op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicket.Flight, op, (org.scribble.runtime.util.Buf<buyTicket_Ticket_4_Future>) this.se.gc);
	}
}