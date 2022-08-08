package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.*;

public interface Select_T_F_GetF_Long<__Succ1 extends Succ_Out_F_GetF_Long> extends Out_F_GetF_Long<__Succ1>, Succ_In_U_ReturnU_Long_String {
	public static final Select_T_F_GetF_Long<?> cast = null;

	@Override
	default Select_T_F_GetF_Long<?> to(Select_T_F_GetF_Long<?> cast) {
		return (Select_T_F_GetF_Long<?>) this;
	}

	default buyTicketError_T_3 to(buyTicketError_T_3 cast) {
		return (buyTicketError_T_3) this;
	}
}