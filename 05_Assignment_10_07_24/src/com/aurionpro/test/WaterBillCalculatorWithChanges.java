package com.aurionpro.test;

import java.util.Scanner;

public class WaterBillCalculatorWithChanges {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed : " );
		double NoOfUnitsConsumed = sc.nextDouble();
		
		double Meter_charge = 75;
		double charge = 0;
		
		if(NoOfUnitsConsumed <= 100) {
			charge += NoOfUnitsConsumed*5;
		}
		else {
			if(NoOfUnitsConsumed <= 250) {
				charge += 100*5;
				double remainingUnit = NoOfUnitsConsumed-100;
				charge += ((remainingUnit)*10);
			}
			else {
				charge += 100*5;
				charge += 150*10;
				double remainingUnit = NoOfUnitsConsumed-250;
				charge += ((remainingUnit)*20);
 			}
		}
		double Total_water_bill = charge + Meter_charge;
		System.out.println("The total water bill for consumed number of units is: Rs." + Total_water_bill);

	}

}
