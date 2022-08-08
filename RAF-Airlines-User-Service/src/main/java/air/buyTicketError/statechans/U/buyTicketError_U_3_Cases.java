package air.buyTicketError.statechans.U;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public final class buyTicketError_U_3_Cases extends org.scribble.runtime.statechans.CaseSocket<buyTicketError, U> implements Case_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<EndSocket, EndSocket> {
	public static final buyTicketError_U_3_Cases cast = null;
	public final buyTicketError_U_3.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketError_U_3_Cases(org.scribble.runtime.session.SessionEndpoint<buyTicketError, U> se, boolean dummy, buyTicketError_U_3.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public air.buyTicketError.statechans.U.EndSocket receive(T role, AddUMileToU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.AddUMileToU)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public air.buyTicketError.statechans.U.EndSocket receive(AddUMileToU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.T, op, arg1, arg2, arg3);
	}

	@SuppressWarnings("unchecked")
	public air.buyTicketError.statechans.U.EndSocket receive(AddUMileToU op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<java.lang.Integer>) this.se.gc);
	}

	public air.buyTicketError.statechans.U.EndSocket receive(T role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public air.buyTicketError.statechans.U.EndSocket receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.T, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public air.buyTicketError.statechans.U.EndSocket receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum getOp() {
		return this.op;
	}
}