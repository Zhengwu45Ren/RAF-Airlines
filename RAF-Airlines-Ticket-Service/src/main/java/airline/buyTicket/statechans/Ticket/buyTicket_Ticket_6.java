package airline.buyTicket.statechans.Ticket;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class buyTicket_Ticket_6 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, Ticket> implements Select_Ticket_User_AddUserMileToUser_Long_Long_Int<EndSocket> {
	public static final buyTicket_Ticket_6 cast = null;

	protected buyTicket_Ticket_6(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	public airline.buyTicket.statechans.Ticket.EndSocket send(User role, AddUserMileToUser op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.AddUserMileToUser, arg0, arg1, arg2);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}