package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_4 extends org.scribble.runtime.statechans.BranchSocket<buyTicketError, T> implements Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<buyTicketError_T_7, buyTicketError_T_5> {
	public static final buyTicketError_T_4 cast = null;

	protected buyTicketError_T_4(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	@Override
	public buyTicketError_T_4_Cases branch(F role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.F);
		Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum openum;
		if (m.op.equals(buyTicketError.ReturnF)) {
			openum = Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum.ReturnF;
		}
		else if (m.op.equals(buyTicketError.ErrorThrow)) {
			openum = Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum.ErrorThrow;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new buyTicketError_T_4_Cases(this.se, true, openum, m);
	}

	public void branch(F role, buyTicketError_T_4_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<buyTicketError_T_7, buyTicketError_T_5>) handler);
	}

	@Override
	public void branch(F role, Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<buyTicketError_T_7, buyTicketError_T_5> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.F);
		if (m.op.equals(buyTicketError.ReturnF)) {
			handler.receive(new buyTicketError_T_5(this.se, true), buyTicketError.ReturnF, new org.scribble.runtime.util.Buf<>((raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			handler.receive(new buyTicketError_T_7(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(F role, Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<Succ_In_F_ErrorThrow_String, Succ_In_F_ReturnF_FlightRes> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.F);
		if (m.op.equals(buyTicketError.ReturnF)) {
			handler.receive(new buyTicketError_T_5(this.se, true), buyTicketError.ReturnF, new org.scribble.runtime.util.Buf<>((raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse) m.payload[0]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			handler.receive(new buyTicketError_T_7(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}