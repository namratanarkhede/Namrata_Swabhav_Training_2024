package com.aurionpro.srp.violation.test;

import java.util.ArrayList;

import com.aurionpro.srp.violation.model.Invoice;
import com.aurionpro.srp.violation.model.PrintInvoice;
import com.aurionpro.srp.violation.model.TaxCalculator;

public class InvoiceTest {
	public static void main(String[] args) {
		//List<Invoice> invoice = new ArrayList<Invoice>();   
		Invoice invoice = new Invoice("123", "Namrata decription", 300.00, 12.00);
		TaxCalculator  taxCalculator = new TaxCalculator(invoice);
		PrintInvoice printInvoice = new PrintInvoice(invoice, taxCalculator);
		printInvoice.print();
	}

//	private static void printInvoice(Invoice invoice) {
//		System.out.println(invoice);
//		
//	}
//
//	private static void calculateTax(Invoice invoice) {
//		double tax = invoice.getAmount()*invoice.getTax()/100;
//		System.out.println(tax);
//		
//	}

	
}
