package com.aurionpro.behavioral.observer.model;

public class SMSNotification implements INotifier{

	@Override
	public void notify(Account account, String operation, double amount) {

		if(operation.equals("deposit")) {
			System.out.println("SMS Notification : In Account : " +account.getAccountNumber()+ " amount" +amount+ " is deposit successfully. The Total Balance: " + account.getBalance());
		}if(operation.equals("withdraw")) {
			System.out.println("SMS Notification : In Account : " +account.getAccountNumber()+ " amount" +amount+ " is withdraw successfully. The Total Balance: " + account.getBalance());
		}
	}
	

}
