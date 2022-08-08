package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.ops.*;

public interface Handle_F_T_ErrorThrow_String__T_GetF_Long<__Succ1 extends Succ_In_T_ErrorThrow_String, __Succ2 extends Succ_In_T_GetF_Long> extends Callback_T_ErrorThrow_String<__Succ1>, Callback_T_GetF_Long<__Succ2> {

	abstract public void receive(__Succ1 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, GetF op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}