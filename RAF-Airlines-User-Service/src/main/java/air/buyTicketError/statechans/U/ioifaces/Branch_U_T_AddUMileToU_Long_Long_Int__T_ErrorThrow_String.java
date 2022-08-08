package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.U.*;

public interface Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<__Succ1 extends Succ_In_T_AddUMileToU_Long_Long_Int, __Succ2 extends Succ_In_T_ErrorThrow_String> extends Succ_Out_T_ReturnU_Long_String {
	public static final Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<?, ?> cast = null;

	abstract Case_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<__Succ1, __Succ2> branch(T role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(T role, Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(T role, Handle_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<Succ_In_T_AddUMileToU_Long_Long_Int, Succ_In_T_ErrorThrow_String> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<?, ?> to(Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<?, ?> cast) {
		return (Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String<?, ?>) this;
	}

	default buyTicketError_U_3 to(buyTicketError_U_3 cast) {
		return (buyTicketError_U_3) this;
	}

public enum Branch_U_T_AddUMileToU_Long_Long_Int__T_ErrorThrow_String_Enum implements org.scribble.runtime.session.OpEnum {
	AddUMileToU, ErrorThrow
}
}