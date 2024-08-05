package com.aurionpro.creational.factory.model;

public class AccountFactory {

    public static IAccount makeAccount(int accountNo, String name, double balance, double minBalance, AccountType accountType) {
        IAccount account = null;

        if (accountType == AccountType.SAVING) {
            account = new SavingAccount(accountNo, name, balance, minBalance);
        } else if (accountType == AccountType.CURRENT) {
            double overDraftLimit = 1000;
            account = new CurrentAccount(accountNo, name, balance, overDraftLimit);
        }

        return account;
    }
}