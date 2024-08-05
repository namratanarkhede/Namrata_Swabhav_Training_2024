package com.aurionpro.model;

public class CurrentAccount extends Account{

	private double OVER_DRAFT_LIMIT;
	
	public CurrentAccount(Integer accNo, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
		this.OVER_DRAFT_LIMIT=OVER_DRAFT_LIMIT;
	}

	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", AccNo=" + getAccNo() + ", Name=" + getName() + ", Balance()="
				+ getBalance() + "]";
	}

	public Integer getOVER_DRAFT_LIMIT() {
		return (int) OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(Integer oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}
	

}
