package air.buyTicketError.ms.T;

import air.buyTicketError.ms.T.ioifaces.*;;
import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;

public final class buyTicketErrorT4MS extends org.scribble.runtime.ms.BranchMS<T> implements MSBranch_T_F_ErrorThrow_String__F_ReturnF_FlightRes {

	protected buyTicketErrorT4MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorT4MSCases branch(F role) {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.F);
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
		return new buyTicketErrorT4MSCases(this.msEndpoint, true, openum, m);
	}
}