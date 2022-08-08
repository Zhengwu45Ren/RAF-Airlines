package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.ops.*;

public interface Case_T_U_ErrorThrow_String__U_ReturnU_Long_String<__Succ1 extends Succ_In_U_ErrorThrow_String, __Succ2 extends Succ_In_U_ReturnU_Long_String> extends In_U_ErrorThrow_String<__Succ1>, In_U_ReturnU_Long_String<__Succ2> {
	public static final Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<?, ?> cast = null;

	abstract Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String.Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum getOp();

	abstract public __Succ1 receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(ReturnU op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}