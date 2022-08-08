package air.buyTicketError.statechans.F;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public final class buyTicketError_F_2 extends org.scribble.runtime.statechans.OutputSocket<buyTicketError, F> implements Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<EndSocket, buyTicketError_F_3> {
	public static final buyTicketError_F_2 cast = null;

	protected buyTicketError_F_2(org.scribble.runtime.session.SessionEndpoint<buyTicketError, F> se, boolean dummy) {
		super(se);
	}

	public buyTicketError_F_3 send(T role, ReturnF op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.ReturnF, arg0);

		return new buyTicketError_F_3(this.se, true);
	}

	public air.buyTicketError.statechans.F.EndSocket send(T role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicketError.ErrorThrow, arg0);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}