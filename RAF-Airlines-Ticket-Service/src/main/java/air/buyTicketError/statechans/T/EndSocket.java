package air.buyTicketError.statechans.T;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicketError, T> implements Succ_Out_U_ErrorThrow_String, Succ_Out_F_ErrorThrow_String, Succ_Out_U_AddUMileToU_Long_Long_Int {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}