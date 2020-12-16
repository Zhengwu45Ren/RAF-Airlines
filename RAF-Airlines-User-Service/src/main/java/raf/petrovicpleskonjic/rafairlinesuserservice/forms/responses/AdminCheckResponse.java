package raf.petrovicpleskonjic.rafairlinesuserservice.forms.responses;

public class AdminCheckResponse {

	private boolean isAdmin;
	
	public AdminCheckResponse(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
