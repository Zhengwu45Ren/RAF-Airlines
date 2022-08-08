package air.buyTicketError.statechans.T;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_2_Cases extends org.scribble.runtime.statechans.CaseSocket<buyTicketError, T> implements Case_T_U_ErrorThrow_String__U_ReturnU_Long_String<buyTicketError_T_8, buyTicketError_T_3> {
	public static final buyTicketError_T_2_Cases cast = null;
	public final buyTicketError_T_2.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketError_T_2_Cases(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy, buyTicketError_T_2.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public buyTicketError_T_3 receive(U role, ReturnU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ReturnU)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.String) m.payload[1];
		return new buyTicketError_T_3(this.se, true);
	}

	public buyTicketError_T_3 receive(ReturnU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.U, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_T_3 receive(ReturnU op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	public buyTicketError_T_8 receive(U role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketError_T_8(this.se, true);
	}

	public buyTicketError_T_8 receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.U, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_T_8 receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum getOp() {
		return this.op;
	}
}