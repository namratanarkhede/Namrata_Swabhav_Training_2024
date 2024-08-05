package com.aurionpro.multidimensionArray;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();
		
		int arr[][] = new int[rows][columns];
		System.out.println("Enter the array element: ");
		for(int i=0; i<rows;i++) {
			for(int j = 0; j< columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array is: ");
		for(int i=0; i<rows;i++) {
			for(int j = 0; j< columns; j++) {
				System.out.print((arr[i][j]+ "\t"));
			}
			System.out.println("");
		}
		System.out.println("Enter the element to search in array : ");
		int number= sc.nextInt();
		boolean found = true;
		for(int i=0; i<rows;i++) {
			for(int j = 0; j< columns; j++) {
				if (arr[i][j] == number) {
					System.out.println("Number Found in array. : " +arr[i][j]);
					found = true;
				}
			}
		}
		if(found = false) {
			System.out.println("Not found.");
		}
		

		
	}

}
