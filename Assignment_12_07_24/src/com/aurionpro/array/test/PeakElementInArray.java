package com.aurionpro.array.test;

import java.util.Scanner;

public class PeakElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the element in array");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+"\t ");
		}
		// [6,2,4,5,2]
		System.out.println("\nPeak elements are: ");
		
		findPeakElement(array);
	}
	public static void findPeakElement(int[] array) {
		int n =  array.length; //n=5
		if(array[0]>array[1]) { //6>2 => true
			System.out.println(array[0] +"\t"); //6
		}
		for(int i = 1; i<n-1; i++) { //i = 1 //i= 2 //i=3
			if(array[i] >=array[i-1] && array[i]>=array[i+1]) { //2>=6&&2>=4 =>false //4>=2&&4>=5 =>false //5>=4&&5>=2 =>true
				System.out.println(array[i]+"\t"); //5
			}
		}
		if(array[n-1]>array[n-2]) { //n =5 => array[4] > array[3] // 2 > 5 
			System.out.println(array[n-1]+"\t");
		}
	}

}
