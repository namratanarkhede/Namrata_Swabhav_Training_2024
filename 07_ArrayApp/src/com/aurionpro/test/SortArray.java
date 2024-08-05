package com.aurionpro.test;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Eneter the size: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the array element");
		for(int i=0 ; i< size; i++) {
			array[i] = sc.nextInt();
		}
		//4 6 3
		int temp = 0;
		for(int i= 0; i <size; i++) {
			for(int j = i+1; j<size; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + ",  \t ");
			
		}
		
		
	}

}
