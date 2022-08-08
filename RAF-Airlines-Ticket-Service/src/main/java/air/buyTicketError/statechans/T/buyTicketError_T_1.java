package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_1 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, T> implements Select_T_U_GetU_String<buyTicketError_T_2> {
	public static final buyTicketError_T_1 cast = null;

	protected buyTicketError_T_1(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_T_1(org.scribble.runtime.session.MPSTEndpoint<buyTicketError, T> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public buyTicketError_T_2 send(U role, GetU op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.GetU, arg0);

		return new buyTicketError_T_2(this.se, true);
	}
}