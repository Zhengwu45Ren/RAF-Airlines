package air.buyTicketError.statechans.F.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_T_ErrorThrow_String<__Succ extends Succ_Out_T_ErrorThrow_String> {

	abstract public __Succ send(T role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}