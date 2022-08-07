package airline.buyTicket;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import airline.buyTicket.roles.*;
import airline.buyTicket.ops.*;

public final class buyTicket extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("airline.buyTicket");
	public static final Flight Flight = airline.buyTicket.roles.Flight.Flight;
	public static final Ticket Ticket = airline.buyTicket.roles.Ticket.Ticket;
	public static final User User = airline.buyTicket.roles.User.User;
	public static final ReturnUser ReturnUser = airline.buyTicket.ops.ReturnUser.ReturnUser;
	public static final ReturnFlight ReturnFlight = airline.buyTicket.ops.ReturnFlight.ReturnFlight;
	public static final GetUser GetUser = airline.buyTicket.ops.GetUser.GetUser;
	public static final AddUserToFlight AddUserToFlight = airline.buyTicket.ops.AddUserToFlight.AddUserToFlight;
	public static final GetFlight GetFlight = airline.buyTicket.ops.GetFlight.GetFlight;
	public static final AddUserMileToUser AddUserMileToUser = airline.buyTicket.ops.AddUserMileToUser.AddUserMileToUser;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {Flight, Ticket, User}));

	public buyTicket() {
		super(buyTicket.IMPATH, buyTicket.SOURCE, buyTicket.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return buyTicket.ROLES;
	}
}