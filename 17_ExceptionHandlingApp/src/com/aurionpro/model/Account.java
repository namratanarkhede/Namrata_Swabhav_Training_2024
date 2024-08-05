package com.aurionpro.model;

import com.aurionpro.exception.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
	
	public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount credited: " + amount + "Total Balance : " + balance);
            return;
        } 
        System.out.println("Invalid amount. Please enter a positive value.");
        
    }
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	public void debit(double amount) {
		if(amount >0) {
			if(amount > balance) {
				throw new InsufficientBalanceException(balance);
			}
			balance -= amount;
			System.out.println("Amount debited: " + amount + "Total Balance : " + balance);
			return;
		}
		System.out.println("Invalid input");
		
	}
}
