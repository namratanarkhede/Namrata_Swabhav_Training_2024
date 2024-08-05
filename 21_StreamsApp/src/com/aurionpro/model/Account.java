package com.aurionpro.model;

public class Account {
	private Integer accno;
	private String name;
	private double balance;
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
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
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Account(Integer accno, String name, Double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
