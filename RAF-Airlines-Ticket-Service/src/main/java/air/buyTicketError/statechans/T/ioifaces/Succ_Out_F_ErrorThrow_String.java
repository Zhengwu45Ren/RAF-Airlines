package air.buyTicketError.statechans.T.ioifaces;

import air.buyTicketError.statechans.T.EndSocket;

public interface Succ_Out_F_ErrorThrow_String {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}