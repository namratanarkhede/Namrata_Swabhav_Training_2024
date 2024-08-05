package com.aurionpro.model;

public class BankTransferPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("The Payment is processed by BankTransferPayment");
	}

	@Override
	public void refund() {
		System.out.println("The amount is refunded by BankTransferPayment");
		System.out.println("-----------------------------------------------");
		
	}
	

}
