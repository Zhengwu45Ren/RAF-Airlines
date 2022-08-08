package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.*;

public interface Select_T_F_AddUToF_Long_Long_Int<__Succ1 extends Succ_Out_F_AddUToF_Long_Long_Int> extends Out_F_AddUToF_Long_Long_Int<__Succ1>, Succ_In_F_ReturnF_FlightRes {
	public static final Select_T_F_AddUToF_Long_Long_Int<?> cast = null;

	@Override
	default Select_T_F_AddUToF_Long_Long_Int<?> to(Select_T_F_AddUToF_Long_Long_Int<?> cast) {
		return (Select_T_F_AddUToF_Long_Long_Int<?>) this;
	}

	default buyTicketError_T_5 to(buyTicketError_T_5 cast) {
		return (buyTicketError_T_5) this;
	}
}