package air.buyTicketError;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import air.buyTicketError.roles.*;
import air.buyTicketError.ops.*;

public final class buyTicketError extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("air.buyTicketError");
	public static final F F = air.buyTicketError.roles.F.F;
	public static final T T = air.buyTicketError.roles.T.T;
	public static final U U = air.buyTicketError.roles.U.U;
	public static final AddUMileToU AddUMileToU = air.buyTicketError.ops.AddUMileToU.AddUMileToU;
	public static final AddUToF AddUToF = air.buyTicketError.ops.AddUToF.AddUToF;
	public static final ErrorThrow ErrorThrow = air.buyTicketError.ops.ErrorThrow.ErrorThrow;
	public static final GetF GetF = air.buyTicketError.ops.GetF.GetF;
	public static final ReturnF ReturnF = air.buyTicketError.ops.ReturnF.ReturnF;
	public static final GetU GetU = air.buyTicketError.ops.GetU.GetU;
	public static final ReturnU ReturnU = air.buyTicketError.ops.ReturnU.ReturnU;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {F, T, U}));

	public buyTicketError() {
		super(buyTicketError.IMPATH, buyTicketError.SOURCE, buyTicketError.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return buyTicketError.ROLES;
	}
}