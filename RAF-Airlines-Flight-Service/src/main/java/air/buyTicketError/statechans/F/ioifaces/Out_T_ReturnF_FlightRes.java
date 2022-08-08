package air.buyTicketError.statechans.F.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Out_T_ReturnF_FlightRes<__Succ extends Succ_Out_T_ReturnF_FlightRes> {

	abstract public __Succ send(T role, ReturnF op, raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses.FlightResponse arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}