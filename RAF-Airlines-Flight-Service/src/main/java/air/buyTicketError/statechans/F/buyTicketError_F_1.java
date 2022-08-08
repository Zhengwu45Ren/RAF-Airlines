package air.buyTicketError.statechans.F;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public final class buyTicketError_F_1 extends org.scribble.runtime.statechans.BranchSocket<buyTicketError, F> implements Branch_F_T_ErrorThrow_String__T_GetF_Long<EndSocket, buyTicketError_F_2> {
	public static final buyTicketError_F_1 cast = null;

	protected buyTicketError_F_1(org.scribble.runtime.session.SessionEndpoint<buyTicketError, F> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_F_1(org.scribble.runtime.session.MPSTEndpoint<buyTicketError, F> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public buyTicketError_F_1_Cases branch(T role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum openum;
		if (m.op.equals(buyTicketError.GetF)) {
			openum = Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum.GetF;
		}
		else if (m.op.equals(buyTicketError.ErrorThrow)) {
			openum = Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum.ErrorThrow;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new buyTicketError_F_1_Cases(this.se, true, openum, m);
	}

	public void branch(T role, buyTicketError_F_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_F_T_ErrorThrow_String__T_GetF_Long<EndSocket, buyTicketError_F_2>) handler);
	}

	@Override
	public void branch(T role, Handle_F_T_ErrorThrow_String__T_GetF_Long<EndSocket, buyTicketError_F_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		if (m.op.equals(buyTicketError.GetF)) {
			handler.receive(new buyTicketError_F_2(this.se, true), buyTicketError.GetF, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(T role, Handle_F_T_ErrorThrow_String__T_GetF_Long<Succ_In_T_ErrorThrow_String, Succ_In_T_GetF_Long> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		if (m.op.equals(buyTicketError.GetF)) {
			handler.receive(new buyTicketError_F_2(this.se, true), buyTicketError.GetF, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}