package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount SavingAccount = new SavingAccount( 123, "Namrata", 123943, 145);
		CurrentAccount CurrentAccount = new CurrentAccount(124, "Nams ", 24324, 100);
		System.out.println(SavingAccount);
		System.out.println(CurrentAccount);
	}

}
