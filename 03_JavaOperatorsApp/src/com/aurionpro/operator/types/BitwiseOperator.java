package com.aurionpro.operator.types;

//Bitwise operators perform bitwise operation on integer.
// { bitwise AND : & , bitwise OR : | , bitwise XOR : ^ , bitwise Complement : ~ }

public class BitwiseOperator {
	 public static void main(String[] args) {
	        int a = 5;  // binary 101
	        int b = 3;  // binary 011
	        
	        System.out.println("a & b: " + (a & b));
	        System.out.println("a | b: " + (a | b));   
	        System.out.println("a ^ b: " + (a ^ b));   
	        System.out.println("~a: " + (~a));     
	        //System.out.println("a << 1: " + (a << 1)); // Left shift
	        //System.out.println("a >> 1: " + (a >> 1)); // Right shift
	        
	 }

}
