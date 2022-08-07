package airline.buyTicket.statechans.Ticket.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface In_User_ReturnUser_Long_String<__Succ extends Succ_In_User_ReturnUser_Long_String> {

	abstract public __Succ receive(User role, ReturnUser op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}