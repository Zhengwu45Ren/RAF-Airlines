package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_5 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, Ticket> implements Select_Ticket_Flight_AddUserToFlight_Long_Long_Int<buyTicket_Ticket_6> {
	public static final buyTicket_Ticket_5 cast = null;

	protected buyTicket_Ticket_5(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Ticket_6 send(Flight role, AddUserToFlight op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.AddUserToFlight, arg0, arg1, arg2);

		return new buyTicket_Ticket_6(this.se, true);
	}
}