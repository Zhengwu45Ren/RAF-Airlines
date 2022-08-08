package air.buyTicketError.statechans.U;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public final class buyTicketError_U_1 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicketError, U> implements Receive_U_T_GetU_String<buyTicketError_U_2> {
	public static final buyTicketError_U_1 cast = null;

	protected buyTicketError_U_1(org.scribble.runtime.session.SessionEndpoint<buyTicketError, U> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_U_1(org.scribble.runtime.session.MPSTEndpoint<buyTicketError, U> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public buyTicketError_U_2 receive(T role, GetU op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketError_U_2(this.se, true);
	}

	public buyTicketError_U_2 async(T role, GetU op, org.scribble.runtime.util.Buf<buyTicketError_U_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicketError_U_1_Future(super.getFuture(buyTicketError.T));
		return new buyTicketError_U_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicketError.T);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_U_2 async(T role, GetU op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicketError.T, op, (org.scribble.runtime.util.Buf<buyTicketError_U_1_Future>) this.se.gc);
	}
}