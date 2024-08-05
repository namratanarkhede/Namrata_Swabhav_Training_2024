package com.swabhav.creational.factory.model;


public class AccountFactory {
	public static AccountFunctionalInterface  makeAccount(AccountType accountType) {
		switch (accountType) {
		case CURRENT:
			return AccountFactory::createCurrent;
		case SAVING:
			return AccountFactory::createSaving;
		default:
			return null;
		}
	}
	
	private static IAccount createSaving(String name, Long accountNumber, double totalBalance, double minimumBalance) {
		return new Current(accountNumber, name, totalBalance);
	}
	
	private static IAccount createCurrent(String name, Long accountNumber, double totalBalance, double OVER_DRAFT_LIMIT ) {
		return new Current(accountNumber, name, totalBalance);
	}
}
