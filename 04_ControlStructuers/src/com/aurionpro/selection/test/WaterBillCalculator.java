package com.aurionpro.selection.test;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of units Consumed : ");
		double numberOfUnitConsumed = scanner.nextDouble();
		double Meter_charge = 75;
		double charge = 0;
		
		if(numberOfUnitConsumed <= 100) {
			charge = numberOfUnitConsumed*5;
			
		}
		else {
			if(numberOfUnitConsumed <= 250) {
				double unitRemain = numberOfUnitConsumed -100;
				charge =10*unitRemain;
				charge = numberOfUnitConsumed*10;
			}else {
				double unitRemain = numberOfUnitConsumed -250;
				charge = 20*unitRemain;
				charge += 500+1500;
			}
		}
		double Total_water_bill = charge+Meter_charge;

		System.out.println("The water bill is : " + Total_water_bill + "Rs");
		
		scanner.close();
	}

}
