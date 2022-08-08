package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_5 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, T> implements Select_T_F_AddUToF_Long_Long_Int<buyTicketError_T_6> {
	public static final buyTicketError_T_5 cast = null;

	protected buyTicketError_T_5(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_T_6 send(F role, AddUToF op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.AddUToF, arg0, arg1, arg2);

		return new buyTicketError_T_6(this.se, true);
	}
}