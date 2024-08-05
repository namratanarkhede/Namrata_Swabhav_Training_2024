package com.aurionpro.test;

import java.util.Scanner;

public class NumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size  = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the array element : ");
		for(int i = 0; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the number to check peresent in array or not : ");
		int number = sc.nextInt(); // [3,4,5] //3
		int temp = number; //3
		boolean Exist = true;
		for(int i = 0 ; i < size; i++) {
			if(temp != array[i]) { //3!=3
				Exist = false;
			}
		}
		if(Exist = true) {

			System.out.println("The element is Exists.");
		}
		else {
			System.out.println("The element not is Exists.");
		}
	}

}
