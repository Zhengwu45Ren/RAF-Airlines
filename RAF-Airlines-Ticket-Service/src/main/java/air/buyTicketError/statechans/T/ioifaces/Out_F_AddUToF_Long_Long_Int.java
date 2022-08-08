package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_F_AddUToF_Long_Long_Int<__Succ extends Succ_Out_F_AddUToF_Long_Long_Int> {

	abstract public __Succ send(F role, AddUToF op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException;
}