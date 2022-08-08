package air.buyTicketError.ms.U;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorU2MS extends org.scribble.runtime.ms.SendMS<U> {

	protected buyTicketErrorU2MS(org.scribble.runtime.session.MSEndpoint<U> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorU3MS send(T role, ReturnU op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.ReturnU, arg0, arg1);

		return new buyTicketErrorU3MS(this.msEndpoint, true);
	}

	public air.buyTicketError.ms.U.EndSocketMS send(T role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.ErrorThrow, arg0);

		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}