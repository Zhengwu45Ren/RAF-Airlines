package air.buyTicketError.ms.F;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorF2MS extends org.scribble.runtime.ms.SendMS<F> {

	protected buyTicketErrorF2MS(org.scribble.runtime.session.MSEndpoint<F> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorF3MS send(T role, ReturnF op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.ReturnF, arg0);

		return new buyTicketErrorF3MS(this.msEndpoint, true);
	}

	public air.buyTicketError.ms.F.EndSocketMS send(T role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.ErrorThrow, arg0);

		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}