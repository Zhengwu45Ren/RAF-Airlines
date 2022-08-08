package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Callback_F_ReturnF_FlightRes<__Succ extends Succ_In_F_ReturnF_FlightRes> {

	abstract public void receive(__Succ schan, ReturnF op, org.scribble.runtime.util.Buf<raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}