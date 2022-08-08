package air.buyTicketError.statechans.F.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Callback_T_ErrorThrow_String<__Succ extends Succ_In_T_ErrorThrow_String> {

	abstract public void receive(__Succ schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}