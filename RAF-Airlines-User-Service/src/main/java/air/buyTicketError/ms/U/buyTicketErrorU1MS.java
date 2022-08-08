package air.buyTicketError.ms.U;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorU1MS extends org.scribble.runtime.ms.ReceiveMS<U> {

	protected buyTicketErrorU1MS(org.scribble.runtime.session.MSEndpoint<U> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public buyTicketErrorU1MS(org.scribble.runtime.session.MSEndpoint<U> msEndpoint) {
		super(msEndpoint);
	}

	public buyTicketErrorU2MS receive(T role, GetU op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.T);
		arg1.val = (java.lang.String) m.payload[0];
		return new buyTicketErrorU2MS(this.msEndpoint, true);
	}
}