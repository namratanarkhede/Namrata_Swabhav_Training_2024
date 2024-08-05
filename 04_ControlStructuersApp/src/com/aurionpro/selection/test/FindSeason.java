package com.aurionpro.selection.test;

import java.util.Scanner;

public class FindSeason {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of  month : ");
		int month = scanner.nextInt();
		
		switch(month) {
			case 12:
			case 11:
			case 10:
	        case 1:
	            System.out.println("WINTER");
	            break;
	        case 2:
	        case 3:
	        case 4:
	        case 5:
	        	System.out.println("SUMMER");
	            break;
	        case 6:
	        case 7:
	        case 8:
	        case 9:
	        	System.out.println("RAINY");
	        	break;
		}
	}

}
