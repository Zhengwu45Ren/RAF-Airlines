package airline.buyTicket.statechans.Ticket.ioifaces;

import airline.buyTicket.statechans.Ticket.EndSocket;

public interface Succ_Out_User_AddUserMileToUser_Long_Long_Int {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}