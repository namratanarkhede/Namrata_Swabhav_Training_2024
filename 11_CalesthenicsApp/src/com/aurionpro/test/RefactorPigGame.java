package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

class Score{
	private int value;
	public Score() {
		value = 0;
	}
	public void add(int points) {
		value+=points;
	}
	public void reset() {
		value= 0;
	}
	public int getValue() {
		return value;
	}
}


class Dice{
	private Random random;
	public Dice() {
		 random = new Random();
	}
	public int roll() {
		return random.nextInt(6)+1;
	}
}

class PlayerTurn{
	private Scanner scanner;
	private Dice dice;
	private Score turnScore;
	
	public PlayerTurn(Scanner scanner, Dice dice) {
		this.scanner = scanner;
		this.dice = dice;
		this.turnScore = new Score();
	}
	public Score play() {
		boolean turnOver = false;
		while(!turnOver) {
			String choice = getChoice();
			
			if(choice.equals("roll")) {
				int dieValue = dice.roll();
				processRoll(dieValue);
				turnOver = isTrunOver(dieValue);
			}
			if(choice.equals("hold")) {
				turnOver = true;
			}
		}
		return turnScore;
	}
	private boolean isTrunOver(int dieValue) {
		return dieValue == 1;
	}
	private void processRoll(int dieValue) {
		System.out.println("Die : " +dieValue);
		if(dieValue == 1) {
			turnScore.reset();
			System.out.println("Turn Over. No Score");
		}
		turnScore.add(dieValue);
		
	}
	private String getChoice() {
		System.out.println("Roll or Hold? : ");
		String input = scanner.next();
		return input.toLowerCase();
	}
	
}

public class RefactorPigGame{
	private Score totalScore;
	private Scanner scanner;
	private Dice dice;
	
	public RefactorPigGame() {
		totalScore = new Score();
		scanner = new Scanner(System.in);
		dice = new Dice();
	}
	public void start() {
		System.out.println("Welcome to PIG game");
		int turn =1;
		while(totalScore.getValue()<20) {
			System.out.println("TURN : "+turn);
			PlayerTurn playerTurn =new PlayerTurn(scanner,dice);
			Score turnScore = playerTurn.play();
			
			totalScore.add(turnScore.getValue());

			System.out.println("Score for turn : "+ turnScore.getValue());
			System.out.println("Total Score : "+ totalScore.getValue() + "\n");
			turn++;
		}
		endGame(turn);
	}
	private void endGame(int turn) {
		System.out.println("You finished in " + (turn -1) + "turns! \n");
		System.out.println("Game Over!");
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		RefactorPigGame refactorPigGame = new RefactorPigGame();
		refactorPigGame.start();
		
	}
	
}
//
//public class RefactorPigGame {
//	
//
//		public static void main(String[] args) {
//			
//			Scanner sc = new Scanner(System.in);
//			Random random = new Random();
//			
//			System.out.println("Welcome to PIG game.");
//			turn(sc);
//			
//			
//		}
//
//		public static void turn(Scanner sc, Random random) {
//			int totalScore = 0;
//			int turn = 1;
//			while(totalScore<20) {
//				System.out.println("TURN : " + turn);
//				turnOver(turn, sc, random);
//				
//				System.out.println("You finised in " +(turn-1)+" turns! \n");
//				System.out.println("Game Over!");
//				sc.close();
//				
//			}
//			
//		}
//		public static void turnOver(int turn, Scanner sc, Random random) {
//			int turnScore = 0;
//			boolean turnOver = false;
//			while(!turnOver) {
//				System.out.println("Roll or Hold?: ");
//				String choice = sc.next().toLowerCase();
//				if(choice.equals("roll")) {
//					int die = random.nextInt(6)+1;
//					rollDie(die, turnScore, turnOver);
//					return;
//				}
//				
//				if(choice.equals("hold")){
//					holdDie(die, turnScore, turnOver, turnScore);
//					return;
//				}else {
//					System.out.println("Invalid Input");
//				}
//			}
//			turn++;
//		}
//
//		public static void rollDie(int die, int turnScore, boolean turnOver) {
//			System.out.println("Die : " + die);
//			if(die == 1) {
//				turnScore = 0;
//				turnOver = true;
//				System.out.println("Turn Over. No Score");
//				return;
//			}
//			turnScore += die;
//			
//		}
//		public static void holdDie(int die, int turnScore, boolean turnOver, int totalScore) {
//			totalScore += turnScore;
//			turnOver = true;
//			System.out.println("Score for turn : " +turnScore);
//			System.out.println("Total score: " + totalScore + "\n");
//			
//		}
//
//}
