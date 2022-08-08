package air.buyTicketError.ms.F;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorF1MSCases extends org.scribble.runtime.ms.CaseMS<F> {
	public final buyTicketErrorF1MS.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketErrorF1MSCases(org.scribble.runtime.session.MSEndpoint<F> msEndpoint, boolean dummy, buyTicketErrorF1MS.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(msEndpoint);
		this.op = op;
		this.m = m;
	}

	public buyTicketErrorF2MS receive(T role, GetF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.GetF)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new buyTicketErrorF2MS(this.msEndpoint, true);
	}

	public buyTicketErrorF2MS receive(GetF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.T, op, arg1);
	}

	public air.buyTicketError.ms.F.EndSocketMS receive(T role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}

	public air.buyTicketError.ms.F.EndSocketMS receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.T, op, arg1);
	}
}