package com.aurionpro.test;

import java.util.Scanner;

public class ArrayPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size  = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the array element : ");
		for(int i = 0; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + ",  \t ");
		}
	}
}
