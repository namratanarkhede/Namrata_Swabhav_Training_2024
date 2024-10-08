package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {
	  public static void main(String[] args) {
	        IAccount savingAccount = AccountFactory.makeAccount(101, "John Doe", 1500.0, 500.0, AccountType.SAVING);
	        IAccount currentAccount = AccountFactory.makeAccount(102, "Jane Smith", 2000.0, 0.0, AccountType.CURRENT);

	        savingAccount.credit(200.0);
	        savingAccount.debit(100.0);

	        currentAccount.credit(500.0);
	        currentAccount.debit(1000.0);
	        currentAccount.debit(2500.0); // This should test overdraft

	    }

}
