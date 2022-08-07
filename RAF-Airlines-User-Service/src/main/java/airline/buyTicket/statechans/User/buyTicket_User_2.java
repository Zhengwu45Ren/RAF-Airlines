package airline.buyTicket.statechans.User;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.User.ioifaces.*;

public final class buyTicket_User_2 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, User> implements Select_User_Ticket_ReturnUser_Long_String<buyTicket_User_3> {
	public static final buyTicket_User_2 cast = null;

	protected buyTicket_User_2(org.scribble.runtime.session.SessionEndpoint<buyTicket, User> se, boolean dummy) {
		super(se);
	}

	public buyTicket_User_3 send(Ticket role, ReturnUser op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.ReturnUser, arg0, arg1);

		return new buyTicket_User_3(this.se, true);
	}
}