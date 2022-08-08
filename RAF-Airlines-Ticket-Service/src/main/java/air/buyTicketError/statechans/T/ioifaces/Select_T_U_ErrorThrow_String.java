package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.*;

public interface Select_T_U_ErrorThrow_String<__Succ1 extends Succ_Out_U_ErrorThrow_String> extends Out_U_ErrorThrow_String<__Succ1>, Succ_In_F_ErrorThrow_String {
	public static final Select_T_U_ErrorThrow_String<?> cast = null;

	@Override
	default Select_T_U_ErrorThrow_String<?> to(Select_T_U_ErrorThrow_String<?> cast) {
		return (Select_T_U_ErrorThrow_String<?>) this;
	}

	default buyTicketError_T_7 to(buyTicketError_T_7 cast) {
		return (buyTicketError_T_7) this;
	}
}