package airline.buyTicket.statechans.Ticket.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface Out_Flight_GetFlight_Long<__Succ extends Succ_Out_Flight_GetFlight_Long> {

	abstract public __Succ send(Flight role, GetFlight op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}