package com.aurionpro.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;


public class Account {

	private int accountNumber;
	
	private String name;
	
	private double balance;
	
	private List<INotifier> notifiers;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<>(); 
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            
            System.out.println("Amount deposit: " + amount + " Total Balance : " + balance);
            notifyAllNotifier("deposit", amount);
            return;
        } 
        System.out.println("Invalid amount. Please enter a positive value.");
        
    }
	
	

	public void withdraw(double amount) {
		if(amount >0) {
			if(amount > balance) {
				throw new InsufficientBalanceException(balance);
			}
			balance -= amount;
			System.out.println("Amount withdraw: " + amount + " Total Balance : " + balance);
			notifyAllNotifier("withdraw", amount);
			return;
		}
		System.out.println("Invalid input");
		
	}
	
	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}
	
	private void notifyAllNotifier(String operation, double amount) {
		for(INotifier notifier : notifiers) {
			notifier.notify(this, operation, amount);
		}
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
}
