package com.aurionpro.selection.test;

import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a charatcer : ");
		char ch = scanner.next().charAt(0);
		switch(ch){
		case ('a' & 'A') :
		case ('e' & 'E') :
		case ('i' & 'I') :
		case ('o' & 'O') :
		case ('u' & 'U') :
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not Vowel");
			
		}
	}
	

}
