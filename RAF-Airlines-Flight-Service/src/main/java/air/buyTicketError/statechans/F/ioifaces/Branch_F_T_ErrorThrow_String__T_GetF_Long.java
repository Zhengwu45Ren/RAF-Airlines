package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.roles.*;
import air.buyTicketError.statechans.F.*;

public interface Branch_F_T_ErrorThrow_String__T_GetF_Long<__Succ1 extends Succ_In_T_ErrorThrow_String, __Succ2 extends Succ_In_T_GetF_Long> {
	public static final Branch_F_T_ErrorThrow_String__T_GetF_Long<?, ?> cast = null;

	abstract Case_F_T_ErrorThrow_String__T_GetF_Long<__Succ1, __Succ2> branch(T role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(T role, Handle_F_T_ErrorThrow_String__T_GetF_Long<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(T role, Handle_F_T_ErrorThrow_String__T_GetF_Long<Succ_In_T_ErrorThrow_String, Succ_In_T_GetF_Long> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	default buyTicketError_F_1 to(buyTicketError_F_1 cast) {
		return (buyTicketError_F_1) this;
	}

public enum Branch_F_T_ErrorThrow_String__T_GetF_Long_Enum implements org.scribble.runtime.session.OpEnum {
	GetF, ErrorThrow
}
}