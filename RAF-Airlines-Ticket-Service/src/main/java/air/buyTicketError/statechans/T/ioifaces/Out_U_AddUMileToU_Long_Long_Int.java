package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_U_AddUMileToU_Long_Long_Int<__Succ extends Succ_Out_U_AddUMileToU_Long_Long_Int> {

	abstract public __Succ send(U role, AddUMileToU op, java.lang.Long arg0, java.lang.Long arg1, java.lang.Integer arg2) throws org.scribble.main.ScribRuntimeException, IOException;
}