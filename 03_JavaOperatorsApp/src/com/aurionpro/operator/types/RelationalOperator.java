package com.aurionpro.operator.types;

import java.util.Scanner;

// used to check the relationship between operands.
// { == , != , < , <= , > , >= }
public class RelationalOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number 1 :");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter the number 2 :");
		int number2 = scanner.nextInt();
        
        System.out.println("Checks if number 1 is greater than number 2 = " + number1 +" > " + number2 + ": " + (number1 > number2));
        System.out.println("Checks if number 1 is less than number 2 = " + number1 +" < " + number2 + ": " + (number1 < number2));
        System.out.println("Checks if number 1 is greater than or equal to number 2 = " + number1 +" >= " + number2 + ": " + (number1 >= number2));
        System.out.println("Checks if number 1 is less than or equal to number 2 = " + number1 +" <= " + number2 + ": " + (number1 <= number2));
        System.out.println("Checks if number 1 is equal to number 2 = " + number1 +" == " + number2 + ": " + (number1 == number2));
        System.out.println("Checks if number 1 is not equal to number 2 = " + number1 +" != " + number2 + ": " + (number1 != number2));

    }

}
