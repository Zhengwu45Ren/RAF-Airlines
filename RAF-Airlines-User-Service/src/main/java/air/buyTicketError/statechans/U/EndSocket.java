package air.buyTicketError.statechans.U;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicketError, U> implements Succ_In_T_ErrorThrow_String, Succ_In_T_AddUMileToU_Long_Long_Int, Succ_Out_T_ErrorThrow_String {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicketError, U> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}