package airline.buyTicket.statechans.Ticket;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_2 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicket, Ticket> implements Receive_Ticket_User_ReturnUser_Long_String<buyTicket_Ticket_3> {
	public static final buyTicket_Ticket_2 cast = null;

	protected buyTicket_Ticket_2(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Ticket_3 receive(User role, ReturnUser op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicket.User);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.String) m.payload[1];
		return new buyTicket_Ticket_3(this.se, true);
	}

	public buyTicket_Ticket_3 async(User role, ReturnUser op, org.scribble.runtime.util.Buf<buyTicket_Ticket_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicket_Ticket_2_Future(super.getFuture(buyTicket.User));
		return new buyTicket_Ticket_3(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicket.User);
	}

	@SuppressWarnings("unchecked")
	public buyTicket_Ticket_3 async(User role, ReturnUser op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicket.User, op, (org.scribble.runtime.util.Buf<buyTicket_Ticket_2_Future>) this.se.gc);
	}
}