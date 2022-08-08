package air.buyTicketError.ms.F;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketErrorF3MS extends org.scribble.runtime.ms.ReceiveMS<F> {

	protected buyTicketErrorF3MS(org.scribble.runtime.session.MSEndpoint<F> msEndpoint, boolean dummy) {
		super(msEndpoint);
	}

	public air.buyTicketError.ms.F.EndSocketMS receive(T role, AddUToF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException {
		org.scribble.runtime.message.ScribMessage m = super.receiveScrib(buyTicketError.T);
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (java.lang.Long) m.payload[1];
		arg3.val = (java.lang.Integer) m.payload[2];
		this.msEndpoint.setCompleted();
		return new EndSocketMS(this.msEndpoint, true);
	}
}