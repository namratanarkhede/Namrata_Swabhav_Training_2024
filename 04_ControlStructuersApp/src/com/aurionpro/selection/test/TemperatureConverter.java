package com.aurionpro.selection.test;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        switch(choice){
        case 1 :
        	System.out.println("Celsius to Fahrenheit : " + (temperature*9/5 + 32) + " �C");
        	break;
        case 2 :
        	System.out.println("Fahrenheit to Celsius : " +(temperature - 32 * 5/9));
        	break;
        case 3:
        	System.out.println("Celsius to Kelvin : "+(temperature + 273.15));
        	break;
        case 4 :
        	System.out.println("Kelvin to Celsius : " + (temperature - 273.15));
        	break;
        case 5 :
        	System.out.println("Fahrenheit to Kelvin : " +(temperature - 32 * 5 / 9 + 273.15));
        	break;
        case 6:
        	System.out.println("Kelvin to Fahrenheit : "+( temperature - 273.15* 9/5 + 32));
        	break;
        default:
        	System.out.println("Plzzz select your choice.");
        	break;
        	
        	
        }
	}

}
