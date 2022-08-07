package airline.buyTicket.statechans.Flight.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface Out_Ticket_ReturnFlight_FlightRes<__Succ extends Succ_Out_Ticket_ReturnFlight_FlightRes> {

	abstract public __Succ send(Ticket role, ReturnFlight op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}