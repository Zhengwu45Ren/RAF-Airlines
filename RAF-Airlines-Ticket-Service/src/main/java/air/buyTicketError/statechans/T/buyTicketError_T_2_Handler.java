package air.buyTicketError.statechans.T;

import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public interface buyTicketError_T_2_Handler extends Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<buyTicketError_T_8, buyTicketError_T_3> {

	@Override
	abstract public void receive(buyTicketError_T_3 schan, ReturnU op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(buyTicketError_T_8 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}