package air.buyTicketError.statechans.U;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public final class buyTicketError_U_3 extends org.scribble.runtime.statechans.BranchSocket<buyTicketError, U> implements Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<EndSocket, EndSocket> {
	public static final buyTicketError_U_3 cast = null;

	protected buyTicketError_U_3(org.scribble.runtime.session.SessionEndpoint<buyTicketError, U> se, boolean dummy) {
		super(se);
	}

	@Override
	public buyTicketError_U_3_Cases branch(T role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum openum;
		if (m.op.equals(buyTicketError.AddUMileToU)) {
			openum = Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum.AddUMileToU;
		}
		else if (m.op.equals(buyTicketError.ErrorThrow)) {
			openum = Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum.ErrorThrow;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new buyTicketError_U_3_Cases(this.se, true, openum, m);
	}

	public void branch(T role, buyTicketError_U_3_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<EndSocket, EndSocket>) handler);
	}

	@Override
	public void branch(T role, Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<EndSocket, EndSocket> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		if (m.op.equals(buyTicketError.AddUMileToU)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), buyTicketError.AddUMileToU, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[1]), new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[2]));
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
	public void handle(T role, Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<Succ_In_T_AddUMileToU_Long_Long_Int, Succ_In_T_ErrorThrow_String> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(buyTicketError.T);
		if (m.op.equals(buyTicketError.AddUMileToU)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), buyTicketError.AddUMileToU, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[1]), new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[2]));
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