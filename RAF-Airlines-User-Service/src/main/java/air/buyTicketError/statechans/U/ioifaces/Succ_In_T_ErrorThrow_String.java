package air.buyTicketError.statechans.U.ioifaces;

import air.buyTicketError.statechans.U.EndSocket;

public interface Succ_In_T_ErrorThrow_String {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}