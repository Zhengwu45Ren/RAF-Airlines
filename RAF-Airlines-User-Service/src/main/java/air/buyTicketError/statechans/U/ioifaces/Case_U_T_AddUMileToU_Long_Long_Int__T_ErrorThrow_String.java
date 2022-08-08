package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.ops.*;

public interface Case_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<__Succ1 extends Succ_In_T_AddUMileToU_Long_Long_Int, __Succ2 extends Succ_In_T_ErrorThrow_String> extends In_T_AddUMileToU_Long_Long_Int<__Succ1>, In_T_ErrorThrow_String<__Succ2> {
	public static final Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<?, ?> cast = null;

	abstract Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String.Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum getOp();

	abstract public air.buyTicketError.statechans.U.EndSocket receive(AddUMileToU op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public air.buyTicketError.statechans.U.EndSocket receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}