package com.aurionpro.operator.types;

import java.util.Scanner;

//Assignment Operator is used to assign a value to any variable.
// arithmetic assignment operator: { = , += , -= , *= , /= , %=  } 

// bitwise assignment operator { &= , ^= , |= , <<= , >>= , >>>= }
public class AssignmentOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scanner.nextInt();
		
		System.out.println("number : " + number); //add 3 in number.
		System.out.println("number += 3 : " + (number += 3)); //add 3 in number.
		System.out.println("number -= 3 : " + (number -= 3)); //subtract 3 from number.
		System.out.println("number *= 3 : " + (number *= 3)); //multiply number by 3
		System.out.println("number /= 3 : " + (number /= 3)); //divide number by 3
		System.out.println("number %= 3 : " + (number %= 3)); //modulo number by 3
		
		//System.out.println("number <<= 3 : " + (number <<= 3)); 
		//System.out.println("number >>= 3 : " + (number >>= 3)); 
		//System.out.println("number >>>= 3 : " + (number >>>= 3)); 
	
	}
	

}
