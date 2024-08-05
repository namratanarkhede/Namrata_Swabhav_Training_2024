package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {
	private int accountNO;
	private String name;
	private double balance;
	private double overDraftLimit;
	
	
	
	
	public CurrentAccount(int accountNO, String name, double balance, double overDraftLimit) {
		super();
		this.accountNO = accountNO;
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}
	public int getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(int accountNO) {
		this.accountNO = accountNO;
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
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	public void credit(double amount) {
		if(amount > 0 ) 
			balance += amount;
		System.out.println("The amount credited" + amount+ "Total Balance :" +balance);

		
	}
	@Override
	public void debit(double amount) {
		if(amount < 0) {
			System.out.println("Amount should be greater than 0");
		}
		if(amount > overDraftLimit){
			System.out.println("You can't debit amount");
		}
		if(amount < overDraftLimit || amount < balance) {
			balance -= amount;
			System.out.println("The amount debited" + amount + "Total Balance : "+balance);
		}
		
	}
	
	

}
