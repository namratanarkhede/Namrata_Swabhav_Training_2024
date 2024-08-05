package com.aurionpro.array.test;

import java.util.Scanner;

public class SquareSortedArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Sorted array element");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i] + "\t") ;
		}
		System.out.println("\n ");
		System.out.println("Squared element of Array is: ");
		
		int[] result = new int[size];
		for(int i=0; i<size; i++) {	
			result[i] =(int) Math.pow(array[i], 2);
			System.out.print(result[i] + "\t") ;
		}
		System.out.println("\n ");
		System.out.println("Sorted Square element is :");
		int temp = 0;
		
		for(int i= 0; i <size; i++) {
			for(int j = i+1; j<size; j++) {
				if(result[i] > result[j]) {
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
			System.out.print(result[i] + "\t ");
			
		}
		
	}

}
