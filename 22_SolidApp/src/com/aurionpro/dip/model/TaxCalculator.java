package com.aurionpro.dip.model;

public class TaxCalculator {

	public int calculateTax(int amount, int rate){
		int tax =0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}
		catch(Exception e) {
			new DBLogger().log("Divide by zero");
		}
		return tax;
	}

}
