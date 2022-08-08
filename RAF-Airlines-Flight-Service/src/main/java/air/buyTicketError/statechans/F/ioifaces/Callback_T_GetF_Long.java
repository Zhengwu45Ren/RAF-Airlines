package air.buyTicketError.statechans.F.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Callback_T_GetF_Long<__Succ extends Succ_In_T_GetF_Long> {

	abstract public void receive(__Succ schan, GetF op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}