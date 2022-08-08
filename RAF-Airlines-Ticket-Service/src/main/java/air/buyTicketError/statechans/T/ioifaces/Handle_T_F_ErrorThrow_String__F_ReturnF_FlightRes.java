package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.ops.*;

public interface Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<__Succ1 extends Succ_In_F_ErrorThrow_String, __Succ2 extends Succ_In_F_ReturnF_FlightRes> extends Callback_F_ErrorThrow_String<__Succ1>, Callback_F_ReturnF_FlightRes<__Succ2> {

	abstract public void receive(__Succ1 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, ReturnF op, org.scribble.runtime.util.Buf<raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}