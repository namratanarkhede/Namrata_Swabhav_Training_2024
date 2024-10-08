package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {
	
	
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter the number accounts you want to add : ");
		int n = sc.nextInt();
		readAccount(n, sc, random, accounts);
		
		
		System.out.println("\nAccount details of account with minimum balance");
		Optional<Account> minBalance = accounts.stream()
				.min(Comparator.comparingDouble(account->account.getBalance()));
		if(minBalance.isPresent()) {
			System.out.println(minBalance);
		}
		
		System.out.println("\nAccount details of account with maximum balance");
		Optional<Account> maxBalance = accounts.stream()
				.max(Comparator.comparingDouble(account->account.getBalance()));
		if(maxBalance.isPresent()) {
			System.out.println(maxBalance);
			
		}
		
		System.out.println("\nShow names greater than 6 characters");
		List<Account> string6char = accounts.stream()
				.filter(account->account.getName().length()>6)
				.collect(Collectors.toList());
		System.out.println(string6char);
		
	
		
		System.out.println("\nTotal of all the balance");
		double totalBalance = accounts.stream()
                .mapToDouble(account->account.getBalance())
                .sum();
        System.out.println(totalBalance);
        
        sc.close();

		
		
	}

	private static void readAccount(int n, Scanner sc, Random random, List<Account> accounts) {
		for(int i= 0; i<n;i++) {
			Integer accno = random.nextInt(100000000);
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the balance : ");
			Double balance = sc.nextDouble();
			
			accounts.add(new Account(accno,name,balance));
		}
	}
	

}
