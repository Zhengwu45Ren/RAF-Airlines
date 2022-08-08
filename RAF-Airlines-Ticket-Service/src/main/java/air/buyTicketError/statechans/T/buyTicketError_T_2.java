package air.buyTicketError.statechans.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public final class buyTicketError_T_2 extends org.scribble.runtime.statechans.BranchSocket<buyTicketError, T> implements Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<buyTicketError_T_8, buyTicketError_T_3> {
	public static final buyTicketError_T_2 cast = null;

	protected buyTicketError_T_2(org.scribble.runtime.session.SessionEndpoint<buyTicketError, T> se, boolean dummy) {
		super(se);
	}

	@Override
	public buyTicketError_T_2_Cases branch(U role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.U);
		Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum openum;
		if (m.op.equals(buyTicketError.ReturnU)) {
			openum = Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum.ReturnU;
		}
		else if (m.op.equals(buyTicketError.ErrorThrow)) {
			openum = Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum.ErrorThrow;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new buyTicketError_T_2_Cases(this.se, true, openum, m);
	}

	public void branch(U role, buyTicketError_T_2_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<buyTicketError_T_8, buyTicketError_T_3>) handler);
	}

	@Override
	public void branch(U role, Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<buyTicketError_T_8, buyTicketError_T_3> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.U);
		if (m.op.equals(buyTicketError.ReturnU)) {
			handler.receive(new buyTicketError_T_3(this.se, true), buyTicketError.ReturnU, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[1]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			handler.receive(new buyTicketError_T_8(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(U role, Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<Succ_In_U_ErrorThrow_String, Succ_In_U_ReturnU_Long_String> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.U);
		if (m.op.equals(buyTicketError.ReturnU)) {
			handler.receive(new buyTicketError_T_3(this.se, true), buyTicketError.ReturnU, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[1]));
		}
		else
		if (m.op.equals(buyTicketError.ErrorThrow)) {
			handler.receive(new buyTicketError_T_8(this.se, true), buyTicketError.ErrorThrow, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}