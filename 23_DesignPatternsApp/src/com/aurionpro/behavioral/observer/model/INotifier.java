package com.aurionpro.behavioral.observer.model;

public interface INotifier {
	
	public void notify(Account account, String operation, double amount);
}
