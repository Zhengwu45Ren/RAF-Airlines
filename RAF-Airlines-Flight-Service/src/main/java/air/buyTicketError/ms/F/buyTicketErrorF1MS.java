package air.buyTicketError.ms.F;

import air.buyTicketError.ms.F.ioifaces.*;;
import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;

public final class buyTicketErrorF1MS extends org.scribble.runtime.ms.BranchMS<F> implements MSBranch_F_T_ErrorThrow_String__T_GetF_Long {

	protected buyTicketErrorF1MS(org.scribble.runtime.session.MSEndpoint<F> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorF1MS(org.scribble.runtime.session.MSEndpoint<F> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketErrorF1MSCases branch(T role) {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.T);
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
		return new buyTicketErrorF1MSCases(this.msEndpoint, true, openum, m);
	}
}