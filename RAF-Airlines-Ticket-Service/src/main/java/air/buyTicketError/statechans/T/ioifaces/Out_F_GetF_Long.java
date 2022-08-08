package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_F_GetF_Long<__Succ extends Succ_Out_F_GetF_Long> {

	abstract public __Succ send(F role, GetF op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}