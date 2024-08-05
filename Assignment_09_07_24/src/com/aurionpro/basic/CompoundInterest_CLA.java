package com.aurionpro.basic;


public class CompoundInterest_CLA {
	public static void main(String[] args) {
		double principal = Double.parseDouble(args[0]);
		
		double rateOfIntrest = Double.parseDouble(args[1]);
		
		double time = Double.parseDouble(args[2]);
	
		double amount = principal * Math.pow((1+rateOfIntrest/100),time ) ;
		double compoundIntrest = amount - principal;
		
		System.out.println("The Compound Interest : " +compoundIntrest);
	
	}


}
