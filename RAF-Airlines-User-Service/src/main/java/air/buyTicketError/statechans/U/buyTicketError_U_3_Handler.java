package air.buyTicketError.statechans.U;

import air.buyTicketError.ops.*;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.U.ioifaces.*;

public interface buyTicketError_U_3_Handler extends Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<EndSocket, EndSocket> {

	@Override
	abstract public void receive(EndSocket schan, AddUMileToU op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.Long> arg2, org.scribble.runtime.util.Buf<java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}