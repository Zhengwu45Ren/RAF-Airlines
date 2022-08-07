package airline.buyTicket.statechans.User.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface Out_Ticket_ReturnUser_Long_String<__Succ extends Succ_Out_Ticket_ReturnUser_Long_String> {

	abstract public __Succ send(Ticket role, ReturnUser op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}