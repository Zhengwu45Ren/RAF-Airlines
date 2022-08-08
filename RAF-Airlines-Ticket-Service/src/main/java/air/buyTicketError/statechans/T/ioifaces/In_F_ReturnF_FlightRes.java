package air.buyTicketError.statechans.T.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface In_F_ReturnF_FlightRes<__Succ extends Succ_In_F_ReturnF_FlightRes> {

	abstract public __Succ receive(F role, ReturnF op, org.scribble.runtime.util.Buf<? super raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}