package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;
import air.buyTicketError.statechans.U.*;

public interface Receive_U_T_GetU_String<__Succ1 extends Succ_In_T_GetU_String> extends In_T_GetU_String<__Succ1> {
	public static final Receive_U_T_GetU_String<?> cast = null;

	abstract public __Succ1 async(T role, GetU op) throws org.scribble.main.ScribRuntimeException;

	default buyTicketError_U_1 to(buyTicketError_U_1 cast) {
		return (buyTicketError_U_1) this;
	}
}