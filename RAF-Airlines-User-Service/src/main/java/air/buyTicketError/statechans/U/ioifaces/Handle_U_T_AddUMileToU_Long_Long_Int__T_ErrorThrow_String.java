package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.ops.*;

public interface Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<__Succ1 extends Succ_In_T_AddUMileToU_Long_Long_Int, __Succ2 extends Succ_In_T_ErrorThrow_String> extends Callback_T_AddUMileToU_Long_Long_Int<__Succ1>, Callback_T_ErrorThrow_String<__Succ2> {

	abstract public void receive(__Succ1 schan, AddUMileToU op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.Long> arg2, org.scribble.runtime.util.Buf<java.lang.Integer> arg3) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}