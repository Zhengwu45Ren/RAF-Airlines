package raf.petrovicpleskonjic.rafairlinesticketservice.forms.responses;

public class UserPurchaseInformationResponse {

	private long userId;

	private String creditCardNumber;
	
	public UserPurchaseInformationResponse() {}

	public UserPurchaseInformationResponse(long userId, String creditCardNumber) {
		this.userId = userId;
		this.creditCardNumber = creditCardNumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
}
