package airline.buyTicket.statechans.User;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.User.ioifaces.*;

public final class buyTicket_User_1 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicket, User> implements Receive_User_Ticket_GetUser_String<buyTicket_User_2> {
	public static final buyTicket_User_1 cast = null;

	protected buyTicket_User_1(org.scribble.runtime.session.SessionEndpoint<buyTicket, User> se, boolean dummy) {
		super(se);
	}

	public buyTicket_User_1(org.scribble.runtime.session.MPSTEndpoint<buyTicket, User> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public buyTicket_User_2 receive(Ticket role, GetUser op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicket.Ticket);
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicket_User_2(this.se, true);
	}

	public buyTicket_User_2 async(Ticket role, GetUser op, org.scribble.runtime.util.Buf<buyTicket_User_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicket_User_1_Future(super.getFuture(buyTicket.Ticket));
		return new buyTicket_User_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicket.Ticket);
	}

	@SuppressWarnings("unchecked")
	public buyTicket_User_2 async(Ticket role, GetUser op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicket.Ticket, op, (org.scribble.runtime.util.Buf<buyTicket_User_1_Future>) this.se.gc);
	}
}