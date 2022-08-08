package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.T.*;

public interface Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<__Succ1 extends Succ_In_U_ErrorThrow_String, __Succ2 extends Succ_In_U_ReturnU_Long_String> extends Succ_Out_U_GetU_String {
	public static final Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<?, ?> cast = null;

	abstract Case_T_U_ErrorThrow_String__U_ReturnU_Long_String<__Succ1, __Succ2> branch(U role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(U role, Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(U role, Handle_T_U_ErrorThrow_String__U_ReturnU_Long_String<Succ_In_U_ErrorThrow_String, Succ_In_U_ReturnU_Long_String> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<?, ?> to(Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<?, ?> cast) {
		return (Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String<?, ?>) this;
	}

	default buyTicketError_T_2 to(buyTicketError_T_2 cast) {
		return (buyTicketError_T_2) this;
	}

public enum Branch_T_U_ErrorThrow_String__U_ReturnU_Long_String_Enum implements org.scribble.runtime.session.OpEnum {
	ReturnU, ErrorThrow
}
}