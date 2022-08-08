package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.U.*;

public interface Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<__Succ1 extends Succ_Out_T_ErrorThrow_String, __Succ2 extends Succ_Out_T_ReturnU_Long_String> extends Out_T_ErrorThrow_String<__Succ1>, Out_T_ReturnU_Long_String<__Succ2>, Succ_In_T_GetU_String {
	public static final Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<?, ?> cast = null;

	@Override
	default Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<?, ?> to(Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<?, ?> cast) {
		return (Select_U_T_ErrorThrow_String__T_ReturnU_Long_String<?, ?>) this;
	}

	default buyTicketError_U_2 to(buyTicketError_U_2 cast) {
		return (buyTicketError_U_2) this;
	}
}