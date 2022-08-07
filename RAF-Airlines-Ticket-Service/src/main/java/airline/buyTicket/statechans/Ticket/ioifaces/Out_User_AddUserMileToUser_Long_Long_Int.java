package airline.buyTicket.statechans.Ticket.ioifaces;

import java.io.IOException;
import airline.buyTicket.*;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public interface Out_User_AddUserMileToUser_Long_Long_Int<__Succ extends Succ_Out_User_AddUserMileToUser_Long_Long_Int> {

	abstract public __Succ send(User role, AddUserMileToUser op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException;
}