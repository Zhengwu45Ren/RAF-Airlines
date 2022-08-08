package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT3MS extends org.scribble.runtime.ms.SendMS<T> {

	protected buyTicketErrorT3MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorT4MS send(F role, GetF op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.GetF, arg0);

		return new buyTicketErrorT4MS(this.msEndpoint, true);
	}
}