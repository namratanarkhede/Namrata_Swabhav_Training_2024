package com.aurionpro.model;

public class SavingAccount extends Account{


	private double MIN_BALANCE;

	public SavingAccount(Integer accNo, String name, double balance, double MIN_BALANCE ) {
		super(accNo, name, balance);
		this.MIN_BALANCE= MIN_BALANCE;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SavingAccount [MIN_BALANCE=" + MIN_BALANCE + ", AccNo=" + getAccNo() + ", Name=" + getName()
				+ ", Balance =" + getBalance() + "]";
	}

	public Double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(Double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}
	
	
}
