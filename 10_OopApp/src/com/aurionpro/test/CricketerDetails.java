package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketerDetails {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class cricketerDetails = Class.forName("CricketerDetails");
		
		CricketPlayer players[]  = new CricketPlayer[2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of player");
		for(int i = 0; i<players.length; i++ ) {
			System.out.println("Enter the player id : ");
			int playerId = sc.nextInt();
			
			System.out.println("Enter the name: ");
			String name =sc.next();
			
			System.out.println("Enter the number of matches");
			int numberOfMatches = sc.nextInt();
			
			System.out.println("Enter the number of runs");
			int runs = sc.nextInt();
			
			System.out.println("Enter the number of wickets");
			int numberOfWickets = sc.nextInt();
			
			players[i] =  new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
			
		}

		for(int i = 0; i<players.length; i++) {
		
			players[i].getPlayerId();
			players[i].getName();
			players[i].getNumberOfMatches();
			players[i].getRuns();
			players[i].getNumberOfWicklets();
			players[i].ShowDetails();
			players[i].calculateAverage();
			
		
		}
		sc.close();
	}
}
