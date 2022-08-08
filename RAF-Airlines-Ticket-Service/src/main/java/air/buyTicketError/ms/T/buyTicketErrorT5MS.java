package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT5MS extends org.scribble.runtime.ms.SendMS<T> {

	protected buyTicketErrorT5MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorT6MS send(F role, AddUToF op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.AddUToF, arg0, arg1, arg2);

		return new buyTicketErrorT6MS(this.msEndpoint, true);
	}
}