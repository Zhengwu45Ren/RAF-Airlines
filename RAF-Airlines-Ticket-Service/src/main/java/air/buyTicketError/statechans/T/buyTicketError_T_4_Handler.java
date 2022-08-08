package air.buyTicketError.statechans.T;

import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.T.ioifaces.*;

public interface buyTicketError_T_4_Handler extends Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<buyTicketError_T_7, buyTicketError_T_5> {

	@Override
	abstract public void receive(buyTicketError_T_5 schan, ReturnF op, org.scribble.runtime.util.Buf<raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(buyTicketError_T_7 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}