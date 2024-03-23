package com.splitbills.splitbillsnow.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Balance {
	
	private String currency;
	private int amount;
	
	public Balance(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Balance [currency=" + currency + ", ammount=" + amount + "]";
	}
	
	
}
