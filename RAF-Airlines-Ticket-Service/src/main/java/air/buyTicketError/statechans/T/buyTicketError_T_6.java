package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_6 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, T> implements Select_T_U_AddUMileToU_Long_Long_Int<EndSocket> {
	public static final buyTicketError_T_6 cast = null;

	protected buyTicketError_T_6(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	public air.buyTicketError.statechans.T.EndSocket send(U role, AddUMileToU op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.AddUMileToU, arg0, arg1, arg2);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}