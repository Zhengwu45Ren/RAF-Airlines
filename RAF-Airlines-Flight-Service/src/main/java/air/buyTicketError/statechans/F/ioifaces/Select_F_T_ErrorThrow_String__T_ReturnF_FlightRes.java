package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.F.*;

public interface Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<__Succ1 extends Succ_Out_T_ErrorThrow_String, __Succ2 extends Succ_Out_T_ReturnF_FlightRes> extends Out_T_ErrorThrow_String<__Succ1>, Out_T_ReturnF_FlightRes<__Succ2>, Succ_In_T_GetF_Long {
	public static final Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<?, ?> cast = null;

	@Override
	default Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<?, ?> to(Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<?, ?> cast) {
		return (Select_F_T_ErrorThrow_String__T_ReturnF_FlightRes<?, ?>) this;
	}

	default buyTicketError_F_2 to(buyTicketError_F_2 cast) {
		return (buyTicketError_F_2) this;
	}
}