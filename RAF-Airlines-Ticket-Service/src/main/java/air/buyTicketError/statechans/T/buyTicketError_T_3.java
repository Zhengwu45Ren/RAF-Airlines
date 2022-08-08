package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_3 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, T> implements Select_T_F_GetF_Long<buyTicketError_T_4> {
	public static final buyTicketError_T_3 cast = null;

	protected buyTicketError_T_3(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_T_4 send(F role, GetF op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.GetF, arg0);

		return new buyTicketError_T_4(this.se, true);
	}
}