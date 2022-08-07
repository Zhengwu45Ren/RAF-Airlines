package airline.buyTicket.statechans.Flight;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;
import airline.buyTicket.statechans.Flight.ioifaces.*;

public final class buyTicket_Flight_2 extends org.scribble.runtime.statechans.OutputSocket<buyTicket, Flight> implements Select_Flight_Ticket_ReturnFlight_FlightRes<buyTicket_Flight_3> {
	public static final buyTicket_Flight_2 cast = null;

	protected buyTicket_Flight_2(org.scribble.runtime.session.SessionEndpoint<buyTicket, Flight> se, boolean dummy) {
		super(se);
	}

	public buyTicket_Flight_3 send(Ticket role, ReturnFlight op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, buyTicket.ReturnFlight, arg0);

		return new buyTicket_Flight_3(this.se, true);
	}
}