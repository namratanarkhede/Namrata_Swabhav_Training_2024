package com.aurionpro.test;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int randomNumber = 1 + (int)(100*Math.random());
		System.out.println(randomNumber);
		int guess;

	    System.out.println("Welcome to the Number Guessing Game!");
	    System.out.println("I have selected a random number. Try to guess it.");
	    
	    do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try guessing higher.");
            } 
            else if (guess > randomNumber) {
                System.out.println("Too high! Try guessing lower.");
            } 
            else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != randomNumber);

        sc.close();
	}

}
