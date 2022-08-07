package airline.buyTicket.statechans.User;

import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.statechans.User.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicket, User> implements Succ_In_Ticket_AddUserMileToUser_Long_Long_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicket, User> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}