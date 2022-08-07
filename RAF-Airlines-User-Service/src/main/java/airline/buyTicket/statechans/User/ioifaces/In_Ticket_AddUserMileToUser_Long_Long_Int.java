package airline.buyTicket.statechans.User.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface In_Ticket_AddUserMileToUser_Long_Long_Int<__Succ extends Succ_In_Ticket_AddUserMileToUser_Long_Long_Int> {

	abstract public __Succ receive(Ticket role, AddUserMileToUser op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Long> arg2, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}