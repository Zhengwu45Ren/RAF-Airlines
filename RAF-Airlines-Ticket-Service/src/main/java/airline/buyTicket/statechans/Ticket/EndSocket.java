package airline.buyTicket.statechans.Ticket;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.Ticket.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicket, Ticket> implements Succ_Out_User_AddUserMileToUser_Long_Long_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicket, Ticket> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}