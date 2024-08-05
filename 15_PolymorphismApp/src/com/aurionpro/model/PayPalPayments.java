package com.aurionpro.model;

public class PayPalPayments extends Payment{

	@Override
	public void processPayment() {
		System.out.println("The payment is processed by PayPalPayment");
	}

	@Override
	public void refund() {
		System.out.println("Amount is refunded by the PayPalPayment.");
		System.out.println("----------------------------------------------");
	}
	

	
}
