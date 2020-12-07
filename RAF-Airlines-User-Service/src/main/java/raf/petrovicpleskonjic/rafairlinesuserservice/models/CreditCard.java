package raf.petrovicpleskonjic.rafairlinesuserservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {

	@Id
	private String number;
	
	private int ccv;
	
	@ManyToOne
	private User owner;
	
	public CreditCard() {}

	public CreditCard(String number, int ccv, User owner) {
		this.number = number;
		this.ccv = ccv;
		this.owner = owner;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
