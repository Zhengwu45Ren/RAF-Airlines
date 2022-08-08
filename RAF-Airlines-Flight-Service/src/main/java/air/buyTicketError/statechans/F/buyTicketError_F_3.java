package air.buyTicketError.statechans.F;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public final class buyTicketError_F_3 extends org.scribble.runtime.statechans.ReceiveSocket<buyTicketError, F> implements Receive_F_T_AddUToF_Long_Long_Int<EndSocket> {
	public static final buyTicketError_F_3 cast = null;

	protected buyTicketError_F_3(org.scribble.runtime.session.SessionEndpoint<buyTicketError, F> se, boolean dummy) {
		super(se);
	}

	public air.buyTicketError.statechans.F.EndSocket receive(T role, AddUToF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public air.buyTicketError.statechans.F.EndSocket async(T role, AddUToF op, org.scribble.runtime.util.Buf<buyTicketError_F_3_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new buyTicketError_F_3_Future(super.getFuture(buyTicketError.T));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(buyTicketError.T);
	}

	@SuppressWarnings("unchecked")
	public air.buyTicketError.statechans.F.EndSocket async(T role, AddUToF op) throws org.scribble.main.ScribRuntimeException {
		return async(buyTicketError.T, op, (org.scribble.runtime.util.Buf<buyTicketError_F_3_Future>) this.se.gc);
	}
}