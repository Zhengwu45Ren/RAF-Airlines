package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT8MS extends org.scribble.runtime.ms.SendMS<T> {

	protected buyTicketErrorT8MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public air.buyTicketError.ms.T.EndSocketMS send(F role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.ErrorThrow, arg0);

		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}