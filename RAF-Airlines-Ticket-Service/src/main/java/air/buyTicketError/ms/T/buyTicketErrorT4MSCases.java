package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT4MSCases extends org.scribble.runtime.ms.CaseMS<T> {
	public final buyTicketErrorT4MS.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketErrorT4MSCases(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy, buyTicketErrorT4MS.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(msEndpoint);
		this.op = op;
		this.m = m;
	}

	public buyTicketErrorT5MS receive(F role, ReturnF op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ReturnF)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0];
		return new buyTicketErrorT5MS(this.msEndpoint, true);
	}

	public buyTicketErrorT5MS receive(ReturnF op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.F, op, arg1);
	}

	public buyTicketErrorT7MS receive(F role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketErrorT7MS(this.msEndpoint, true);
	}

	public buyTicketErrorT7MS receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		return receive(buyTicketError.F, op, arg1);
	}
}