package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT2MSCases extends org.scribble.runtime.ms.CaseMS<T> {
	public final buyTicketErrorT2MS.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketErrorT2MSCases(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy, buyTicketErrorT2MS.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(msEndpoint);
		this.op = op;
		this.m = m;
	}

	public buyTicketErrorT3MS receive(U role, ReturnU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ReturnU)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.String) m.payload[1];
		return new buyTicketErrorT3MS(this.msEndpoint, true);
	}

	public buyTicketErrorT3MS receive(ReturnU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.U, op, arg1, arg2);
	}

	public buyTicketErrorT8MS receive(U role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketErrorT8MS(this.msEndpoint, true);
	}

	public buyTicketErrorT8MS receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.U, op, arg1);
	}
}