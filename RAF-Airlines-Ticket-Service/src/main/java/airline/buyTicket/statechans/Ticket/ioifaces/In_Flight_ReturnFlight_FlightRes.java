package airline.buyTicket.statechans.Ticket.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface In_Flight_ReturnFlight_FlightRes<__Succ extends Succ_In_Flight_ReturnFlight_FlightRes> {

	abstract public __Succ receive(Flight role, ReturnFlight op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}