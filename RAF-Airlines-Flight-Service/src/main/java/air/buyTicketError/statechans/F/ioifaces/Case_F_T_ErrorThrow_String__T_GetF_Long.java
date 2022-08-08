package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.ops.*;

public interface Case_F_T_ErrorThrow_String__T_GetF_Long<__Succ1 extends Succ_In_T_ErrorThrow_String, __Succ2 extends Succ_In_T_GetF_Long> extends In_T_ErrorThrow_String<__Succ1>, In_T_GetF_Long<__Succ2> {
	public static final Branch_F_T_ErrorThrow_String__T_GetF_Long<?, ?> cast = null;

	abstract Branch_F_T_ErrorThrow_String__T_GetF_Long.Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum getOp();

	abstract public air.buyTicketError.statechans.F.EndSocket receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(GetF op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}