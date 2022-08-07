package airline.buyTicket.statechans.Ticket.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface Out_User_GetUser_String<__Succ extends Succ_Out_User_GetUser_String> {

	abstract public __Succ send(User role, GetUser op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}