package com.aurionpro.test;
import java.util.Scanner;
public class TreasureIslandGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island Game.");
		System.out.println("Your mission is to find the treasure");
		
		System.out.println("Make a choice for your next Move : (left or right) ");
		String choice1 = sc.nextLine().toLowerCase();
		
		if (choice1.equals("left")) {
			System.out.println("Make a next Move : ( swim or wait )");
			String choice2 = sc.nextLine().toLowerCase();
			
			if(choice2.equals("wait")) {
				System.out.println("Make a next Move : ( Red or Blue or Yellow ) ");
				String choice3 = sc.nextLine().toLowerCase();
				
				if(choice3.equals("red")) {
					System.out.println("Burned by fire.");
					System.out.println("Game Over");
				}
				else if(choice3.equals("blue")) {
					System.out.println("Eaten by beasts.");
					System.out.println("Game Over");
				}
				else if(choice3.equals("yellow")) {
					System.out.println("You Win!");
				}
				else {
					System.out.println("Game Over");
				}
			}
			else {
				System.out.println("Attacked by trout.");
				System.out.println("Game Over");	
			}
		}
		else {
			System.out.println("Uhhhohh! Fall into a hole.");
			System.out.println("Game Over");
		}
		sc.close();
	}

}
