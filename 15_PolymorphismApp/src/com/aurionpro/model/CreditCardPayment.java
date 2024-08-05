package com.aurionpro.model;

public class CreditCardPayment extends Payment{

	@Override
	public void processPayment() {

		System.out.println("Payment processed by CreditCardPayment.");
	}

	@Override
	public void refund() {
		System.out.println("Amount refunded by CreditCardPayments");
		System.out.println("----------------------------------------");
	}
	
	

}
