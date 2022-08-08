package air.buyTicketError.ms.T;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorT6MS extends org.scribble.runtime.ms.SendMS<T> {

	protected buyTicketErrorT6MS(org.scribble.runtime.session.MSEndpoint<T> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public air.buyTicketError.ms.T.EndSocketMS send(U role, AddUMileToU op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException {
		super.sendScrib(role, buyTicketError.AddUMileToU, arg0, arg1, arg2);

		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}