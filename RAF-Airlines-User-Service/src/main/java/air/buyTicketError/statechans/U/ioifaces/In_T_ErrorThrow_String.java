package air.buyTicketError.statechans.U.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface In_T_ErrorThrow_String<__Succ extends Succ_In_T_ErrorThrow_String> {

	abstract public __Succ receive(T role, ErrorThrow op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}