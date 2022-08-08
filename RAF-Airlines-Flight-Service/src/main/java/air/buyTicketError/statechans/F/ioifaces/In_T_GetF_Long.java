package air.buyTicketError.statechans.F.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface In_T_GetF_Long<__Succ extends Succ_In_T_GetF_Long> {

	abstract public __Succ receive(T role, GetF op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}