package com.aurionpro.behavioral.observer.model;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;

	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}
	public String getMessage() {
		return "Uhhohh!! You have Insufficient balance. " +balance;
	}

}
