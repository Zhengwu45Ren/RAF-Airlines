package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_U_ErrorThrow_String<__Succ extends Succ_Out_U_ErrorThrow_String> {

	abstract public __Succ send(U role, ErrorThrow op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}