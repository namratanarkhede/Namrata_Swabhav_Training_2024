package com.aurionpro.srp.violation.model;

public class PrintInvoice {
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	public PrintInvoice(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}
	
	public void print() {
		System.out.println(invoice.getId());
		System.out.println(invoice.getDescription());
		System.out.println(invoice.getAmount());
		System.out.println(invoice.getTax());
		System.out.println(taxCalculator.calculateTax());
		System.out.println(invoice.getAmount());
	}
	

}
