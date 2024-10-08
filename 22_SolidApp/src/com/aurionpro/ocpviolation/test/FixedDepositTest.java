package com.aurionpro.ocpviolation.test;

import com.aurionpro.ocpviolation.model.CalculateSimpleIntrest;
import com.aurionpro.ocpviolation.model.DiwaliInterest;
import com.aurionpro.ocpviolation.model.FixedDeposit;
import com.aurionpro.ocpviolation.model.IFestivalInterest;

public class FixedDepositTest {
	public static void main(String[] args) {
		 IFestivalInterest diwaliInterest = new DiwaliInterest();
	        
	        // Create a FixedDeposit instance
	        FixedDeposit fd = new FixedDeposit(123, "Namrata", 20000, 2, diwaliInterest);
	        
	        // Create a CalculateSimpleInterest instance with the FixedDeposit
	        CalculateSimpleIntrest interestCalculator = new CalculateSimpleIntrest(fd);
	        
	        // Calculate and print the simple interest
	        double interest = interestCalculator.simpleIntrest();
	        System.out.println("Fixed Deposit Details: " + fd);
	        System.out.println("Calculated Simple Interest: " + interest);
	    }
}
