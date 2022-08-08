package air.buyTicketError.ms.U;

import air.buyTicketError.ms.U.ioifaces.*;;
import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;

public final class buyTicketErrorU3MS extends org.scribble.runtime.ms.BranchMS<U> implements MSBranch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String {

	protected buyTicketErrorU3MS(org.scribble.runtime.session.MSEndpoint<U> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorU3MSCases branch(T role) {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.T);
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
		return new buyTicketErrorU3MSCases(this.msEndpoint, true, openum, m);
	}
}