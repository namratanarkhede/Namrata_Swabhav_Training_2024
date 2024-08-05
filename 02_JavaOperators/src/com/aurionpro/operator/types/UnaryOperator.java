package com.aurionpro.operator.types;

import java.util.Scanner;

// unary operators operate on single operand
// { unary minus : - , unary plus : + }
// { ++(pre-increment / post-increment) , --(pre-decrement, post-decrement}
public class UnaryOperator {

	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the number : ");
	      int number = scanner.nextInt();
	      System.out.println("+number = " + (+number));
	      System.out.println("-number = " + (-number));
	        
	      System.out.print("Enter the number : ");
	      int number2 = scanner.nextInt();
	      System.out.println("++number2 = " + (++number2));
	      System.out.println("number2++ = " + (number2++)); 
	      System.out.println("number = " +number2);
	      System.out.println("--number2 = " + (--number2));
	      System.out.println("number2-- = " + (number2--));
	      System.out.println("number = " +number2);
	    }
}
