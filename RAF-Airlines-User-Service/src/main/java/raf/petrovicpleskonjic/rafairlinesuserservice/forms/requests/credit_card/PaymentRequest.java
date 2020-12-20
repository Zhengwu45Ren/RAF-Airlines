package raf.petrovicpleskonjic.rafairlinesuserservice.forms.requests.credit_card;

public class PaymentRequest {

	private String creditCardNumber;
	
	private Float amount;
	private Integer miles;
	
	public PaymentRequest() {}

	public PaymentRequest(String creditCardNumber, Float amount, Integer miles) {
		this.creditCardNumber = creditCardNumber;
		this.amount = amount;
		this.miles = miles;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	public Integer getMiles() {
		return miles;
	}
	
	public void setMiles(Integer miles) {
		this.miles = miles;
	}
}
