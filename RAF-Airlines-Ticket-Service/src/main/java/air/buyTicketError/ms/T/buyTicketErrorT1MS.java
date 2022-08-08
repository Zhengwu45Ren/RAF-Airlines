package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT1MS extends org.scribble.runtime.ms.SendMS<T> {

	protected buyTicketErrorT1MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorT1MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketErrorT2MS send(U role, GetU op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.GetU, arg0);

		return new buyTicketErrorT2MS(this.msEndpoint, true);
	}
}