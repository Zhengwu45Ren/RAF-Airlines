package air.buyTicketError.statechans.F.ioifaces;

import air.buyTicketError.statechans.F.EndSocket;

public interface Succ_In_T_ErrorThrow_String {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}