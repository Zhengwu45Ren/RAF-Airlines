package air.buyTicketError.statechans.F;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public final class buyTicketError_F_1_Cases extends org.scribble.runtime.statechans.CaseSocket<buyTicketError, F> implements Case_F_T_ErrorThrow_String__T_GetF_Long<EndSocket, buyTicketError_F_2> {
	public static final buyTicketError_F_1_Cases cast = null;
	public final buyTicketError_F_1.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketError_F_1_Cases(org.scribble.runtime.session.SessionEndpoint<buyTicketError, F> se, boolean dummy, buyTicketError_F_1.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public buyTicketError_F_2 receive(T role, GetF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.GetF)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new buyTicketError_F_2(this.se, true);
	}

	public buyTicketError_F_2 receive(GetF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.T, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_F_2 receive(GetF op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public air.buyTicketError.statechans.F.EndSocket receive(T role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public air.buyTicketError.statechans.F.EndSocket receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.T, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public air.buyTicketError.statechans.F.EndSocket receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_F_T_ErrorThrow_String__T_GetF_Long.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum getOp() {
		return this.op;
	}
}