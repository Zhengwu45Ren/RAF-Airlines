package air.buyTicketError.statechans.U.ioifaces;

import java.io.IOException;
import air.buyTicketError.*;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public interface Callback_T_AddUMileToU_Long_Long_Int<__Succ extends Succ_In_T_AddUMileToU_Long_Long_Int> {

	abstract public void receive(__Succ schan, AddUMileToU op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.Long> arg2, org.scribble.runtime.util.Buf<java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}