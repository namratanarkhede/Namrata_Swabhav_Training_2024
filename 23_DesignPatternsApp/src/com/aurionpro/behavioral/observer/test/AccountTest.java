package com.aurionpro.behavioral.observer.test;

import java.util.Scanner;

import com.aurionpro.behavioral.observer.model.Account;
import com.aurionpro.behavioral.observer.model.AppNotification;
import com.aurionpro.behavioral.observer.model.EmailNotifier;
import com.aurionpro.behavioral.observer.model.InsufficientBalanceException;
import com.aurionpro.behavioral.observer.model.SMSNotification;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int accountNumber = 123;
		
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter the balance: ");
		double balance = sc.nextDouble();
		
		Account account = new Account(accountNumber, name, balance);
		sc.nextLine();

		System.out.println("Select Notification Preferences (Enter comma-separated values): ");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. App");

        String[] choices = sc.nextLine().split(",");
        
        for (String choice : choices) {
            switch (choice.trim()) {
                case "1":
                    account.registerNotifier(new SMSNotification());
                    break;
                case "2":
                    account.registerNotifier(new EmailNotifier());
                    break;
                case "3":
                    account.registerNotifier(new AppNotification());
                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }
        
        while(true) {
        	System.out.println("\nSelect Operation");
        	System.out.println("1. Deposit");
        	System.out.println("2. Withdraw");
        	System.out.println("3. exit");
        	int operation = sc.nextInt();
        	
        	System.out.println("Enter amount: ");
        	double amount = sc.nextDouble();
        	
        	try {
        		switch(operation) {
        		case 1:
        			account.deposit(amount);
        			break;
        		case 2: 
        			account.withdraw(amount);
        		case 3:
        			break;
        		default:
        			System.out.println("Invalid Operation");
        		}
        	}catch(InsufficientBalanceException e) {
				throw new InsufficientBalanceException(balance);
        	}
        }
		
	}

}
