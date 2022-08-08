package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_8 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, T> implements Select_T_F_ErrorThrow_String<EndSocket> {
	public static final buyTicketError_T_8 cast = null;

	protected buyTicketError_T_8(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	public air.buyTicketError.statechans.T.EndSocket send(F role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.ErrorThrow, arg0);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}