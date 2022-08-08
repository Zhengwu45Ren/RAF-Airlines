package air.buyTicketError.statechans.F;

import air.buyTicketError.ops.*;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.F.ioifaces.*;

public interface buyTicketError_F_1_Handler extends Handle_F_T_ErrorThrow_String__T_GetF_Long<EndSocket, buyTicketError_F_2> {

	@Override
	abstract public void receive(buyTicketError_F_2 schan, GetF op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}