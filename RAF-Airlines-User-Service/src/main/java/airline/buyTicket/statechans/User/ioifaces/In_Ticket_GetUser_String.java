package airline.buyTicket.statechans.User.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface In_Ticket_GetUser_String<__Succ extends Succ_In_Ticket_GetUser_String> {

	abstract public __Succ receive(Ticket role, GetUser op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}