package com.aurionpro.test;

import java.util.Scanner;

public class SumArrayElement {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size  = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the array element : ");
		for(int i = 0; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i < size; i++) {
			sum += array[i];
		}
		System.out.println("sum of array is : " +sum);
	}

}
