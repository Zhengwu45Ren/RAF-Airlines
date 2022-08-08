package air.buyTicketError.statechans.F;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<buyTicketError, F> implements Succ_In_T_AddUToF_Long_Long_Int, Succ_Out_T_ErrorThrow_String, Succ_In_T_ErrorThrow_String {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<buyTicketError, F> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}