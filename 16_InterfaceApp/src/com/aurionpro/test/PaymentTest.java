package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		CreditCardPayment payment1 = new CreditCardPayment();
		payment1.processPayment();
		payment1.refund();
		
		PayPalPayment payment2 = new PayPalPayment();
		payment2.processPayment();
		payment2.refund();
		
		BankTransferPayment payment3 = new BankTransferPayment();
		payment3.processPayment();
		payment3.refund();
		
		

		//data abstraction
		//interface method makes method overriding complusory.
		
		System.out.println("Data Abstraction");
		System.out.println("------------------------------");
		Payment payment;
		payment = new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new PayPalPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new BankTransferPayment();
		payment.processPayment();
		payment.refund();
	}
}
