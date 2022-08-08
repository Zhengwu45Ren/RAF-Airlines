package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface In_U_ReturnU_Long_String<__Succ extends Succ_In_U_ReturnU_Long_String> {

	abstract public __Succ receive(U role, ReturnU op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}