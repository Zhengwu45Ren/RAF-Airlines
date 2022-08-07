package airline.buyTicket.statechans.Flight.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface In_Ticket_GetFlight_Long<__Succ extends Succ_In_Ticket_GetFlight_Long> {

	abstract public __Succ receive(Ticket role, GetFlight op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}