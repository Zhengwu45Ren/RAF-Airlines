package air.buyTicketError.statechans.U;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public final class buyTicketError_U_2 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, U> implements Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<EndSocket, buyTicketError_U_3> {
	public static final buyTicketError_U_2 cast = null;

	protected buyTicketError_U_2(org.scribble.runtime.session.SessionEndpoint<buyTicketError, U> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_U_3 send(T role, ReturnU op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.ReturnU, arg0, arg1);

		return new buyTicketError_U_3(this.se, true);
	}

	public air.buyTicketError.statechans.U.EndSocket send(T role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.ErrorThrow, arg0);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}