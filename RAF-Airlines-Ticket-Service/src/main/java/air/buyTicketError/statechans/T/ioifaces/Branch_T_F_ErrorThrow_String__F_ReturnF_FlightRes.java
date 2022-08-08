package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.*;

public interface Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<__Succ1 extends Succ_In_F_ErrorThrow_String, __Succ2 extends Succ_In_F_ReturnF_FlightRes> extends Succ_Out_F_GetF_Long {
	public static final Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<?, ?> cast = null;

	abstract Case_T_F_ErrorThrow_String__F_ReturnF_FlightRes<__Succ1, __Succ2> branch(F role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(F role, Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(F role, Handle_T_F_ErrorThrow_String__F_ReturnF_FlightRes<Succ_In_F_ErrorThrow_String, Succ_In_F_ReturnF_FlightRes> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<?, ?> to(Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<?, ?> cast) {
		return (Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes<?, ?>) this;
	}

	default buyTicketError_T_4 to(buyTicketError_T_4 cast) {
		return (buyTicketError_T_4) this;
	}

public enum Branch_T_F_ErrorThrow_String__F_ReturnF_FlightRes_Enum implements org.scribble.runtime.session.OpEnum {
	ReturnF, ErrorThrow
}
}