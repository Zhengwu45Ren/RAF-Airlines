package air.buyTicketError.ms.T;

import air.buyTicketError.ms.T.ioifaces.*;;
import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;

public final class buyTicketErrorT2MS extends org.scribble.runtime.ms.BranchMS<T> implements MSBranch_T_U_ErrorThrow_String__U_ReturnU_Long_String {

	protected buyTicketErrorT2MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorT2MSCases branch(U role) {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.U);
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
		return new buyTicketErrorT2MSCases(this.msEndpoint, true, openum, m);
	}
}