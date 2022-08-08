package air.buyTicketError.statechans.T;

import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_4_Cases extends org.scribble.runtime.statechans.CaseSocket<buyTicketError, T> implements Case_T_F_ErrorThrow_String__F_ReturnF_FlightRes<buyTicketError_T_7, buyTicketError_T_5> {
	public static final buyTicketError_T_4_Cases cast = null;
	public final buyTicketError_T_4.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected buyTicketError_T_4_Cases(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy, buyTicketError_T_4.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public buyTicketError_T_5 receive(F role, ReturnF op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ReturnF)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0];
		return new buyTicketError_T_5(this.se, true);
	}

	public buyTicketError_T_5 receive(ReturnF op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.F, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_T_5 receive(ReturnF op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse>) this.se.gc);
	}

	public buyTicketError_T_7 receive(F role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(buyTicketError.ErrorThrow)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketError_T_7(this.se, true);
	}

	public buyTicketError_T_7 receive(ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(buyTicketError.F, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public buyTicketError_T_7 receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum getOp() {
		return this.op;
	}
}