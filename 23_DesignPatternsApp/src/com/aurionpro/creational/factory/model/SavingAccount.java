package com.aurionpro.creational.factory.model;


public class SavingAccount implements IAccount {
	
	private int accountNo;
	private String name;
	private double balance;
	private double minBalance;
	
	
	
	
	public SavingAccount(int accountNo, String name, double balance, double minBalance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public void credit(double amount) {
		if(amount > 0 ) 
			balance += amount;
		System.out.println("The amount credited" + amount+ "Total Balance :" +balance);

		
	}

	@Override
	public void debit(double amount) {
		if(amount > 0 || amount <minBalance) {
			balance -= amount;
		}
		System.out.println("The amount debited " + amount + "Total Balance " + balance);
		
	}
	

}
