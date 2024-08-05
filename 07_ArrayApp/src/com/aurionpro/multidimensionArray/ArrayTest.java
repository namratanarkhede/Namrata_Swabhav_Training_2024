package com.aurionpro.multidimensionArray;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of rows : ");
			int rows = sc.nextInt();
			System.out.println("Enter the number of columns : ");
			int columns = sc.nextInt();
			System.out.println("Enter the array element: ");
			
			int arr[][]=new int[rows][columns];
			for(int i=0; i< rows; i++) {
				for(int j=0; j<columns; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("Array is : ");
			for(int i=0; i< rows; i++) {
				for(int j=0; j<columns; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println("");
			}
			
		}
	}

}
