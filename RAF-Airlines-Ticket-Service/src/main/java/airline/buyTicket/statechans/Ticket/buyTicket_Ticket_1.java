package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_1 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, Ticket> implements Select_Ticket_User_GetUser_String<buyTicket_Ticket_2> {
	public static final buyTicket_Ticket_1 cast = null;

	protected buyTicket_Ticket_1(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Ticket_1(org.scribble.runtime.session.MPSTEndpoint<buyTicket, Ticket> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public buyTicket_Ticket_2 send(User role, GetUser op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.GetUser, arg0);

		return new buyTicket_Ticket_2(this.se, true);
	}
}