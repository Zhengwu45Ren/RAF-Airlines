package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.ops.*;

public interface Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<__Succ1 extends Succ_In_U_ErrorThrow_String, __Succ2 extends Succ_In_U_ReturnU_Long_String> extends Callback_U_ErrorThrow_String<__Succ1>, Callback_U_ReturnU_Long_String<__Succ2> {

	abstract public void receive(__Succ1 schan, ErrorThrow op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, ReturnU op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.String> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}