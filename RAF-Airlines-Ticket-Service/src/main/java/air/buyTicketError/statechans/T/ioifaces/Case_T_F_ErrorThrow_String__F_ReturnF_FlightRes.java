package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.ops.*;

public interface Case_T_F_ErrorThrow_String__F_ReturnF_FlightRes<__Succ1 extends Succ_In_F_ErrorThrow_String, __Succ2 extends Succ_In_F_ReturnF_FlightRes> extends In_F_ErrorThrow_String<__Succ1>, In_F_ReturnF_FlightRes<__Succ2> {
	public static final Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<?, ?> cast = null;

	abstract Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes.Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum getOp();

	abstract public __Succ1 receive(ErrorThrow op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(ReturnF op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}