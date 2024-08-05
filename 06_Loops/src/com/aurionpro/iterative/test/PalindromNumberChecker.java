package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PalindromNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int reverse = 0 , digit = 0;
		int temp = number;
		//123
		while(number != 0) {//123 /12 /1
			digit = number%10;//3 /2 /1
			reverse = reverse* 10+ digit;// 0*10+3 = 3 // 3*10+2 = 32 // 32 * 10+1 = 321
			number = number/10;//12 /1
		}
		if(reverse == temp) {
			System.out.println("The number is palindrom");
		}
		else {
			System.out.println("The number is Not palindrom");
		}
	}


}
