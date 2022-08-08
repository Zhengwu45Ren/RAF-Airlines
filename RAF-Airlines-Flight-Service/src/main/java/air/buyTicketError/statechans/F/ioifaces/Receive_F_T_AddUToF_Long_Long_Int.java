package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.F.*;

public interface Receive_F_T_AddUToF_Long_Long_Int<__Succ1 extends Succ_In_T_AddUToF_Long_Long_Int> extends In_T_AddUToF_Long_Long_Int<__Succ1>, Succ_Out_T_ReturnF_FlightRes {
	public static final Receive_F_T_AddUToF_Long_Long_Int<?> cast = null;

	abstract public air.buyTicketError.statechans.F.EndSocket async(T role, AddUToF op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_F_T_AddUToF_Long_Long_Int<?> to(Receive_F_T_AddUToF_Long_Long_Int<?> cast) {
		return (Receive_F_T_AddUToF_Long_Long_Int<?>) this;
	}

	default buyTicketError_F_3 to(buyTicketError_F_3 cast) {
		return (buyTicketError_F_3) this;
	}
}