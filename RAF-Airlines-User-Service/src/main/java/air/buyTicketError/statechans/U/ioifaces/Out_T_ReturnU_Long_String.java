package air.buyTicketError.statechans.U.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_T_ReturnU_Long_String<__Succ extends Succ_Out_T_ReturnU_Long_String> {

	abstract public __Succ send(T role, ReturnU op, java.lang.Long arg0, java.lang.String arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}