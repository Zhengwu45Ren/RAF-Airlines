package air.buyTicketError.ms.U;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorU3MSCases extends org.scribble.runtime.ms.CaseMS<U> {
	public final buyTicketErrorU3MS.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketErrorU3MSCases(org.scribble.runtime.session.MSEndpoint<U> msEndpoint, boolean dummy, buyTicketErrorU3MS.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(msEndpoint);
		this.op = op;
		this.m = m;
	}

	public air.buyTicketError.ms.U.EndSocketMS receive(T role, AddUMileToU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.AddUMileToU)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}

	public air.buyTicketError.ms.U.EndSocketMS receive(AddUMileToU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.T, op, arg1, arg2, arg3);
	}

	public air.buyTicketError.ms.U.EndSocketMS receive(T role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}

	public air.buyTicketError.ms.U.EndSocketMS receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.T, op, arg1);
	}
}