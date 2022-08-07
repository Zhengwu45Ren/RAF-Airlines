package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_3 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, Ticket> implements Select_Ticket_Flight_GetFlight_Long<buyTicket_Ticket_4> {
	public static final buyTicket_Ticket_3 cast = null;

	protected buyTicket_Ticket_3(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Ticket_4 send(Flight role, GetFlight op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.GetFlight, arg0);

		return new buyTicket_Ticket_4(this.se, true);
	}
}