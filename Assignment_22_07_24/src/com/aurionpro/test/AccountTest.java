package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        List<Account> accounts = new ArrayList<>();
        
        System.out.print("Enter the Number of Accounts you want to add: ");
        int n = scanner.nextInt();
        
        readAccount(scanner, random, n, accounts);
        System.out.println("\n------------------------All Account Details -----------------------");
        printAccountDetails(accounts);
        
        System.out.println("\n------------------------Maximum Balance Account Detail-------------");
        maximumBalanceAccount(accounts);
        
        System.out.println("\n-----------------------Balance In Descending Order-----------------");
        balanceDescendingOrder(accounts, accounts.size()); 
        printAccountDetails(accounts);
    }

    private static void balanceDescendingOrder(List<Account> accounts, int n) {
        if (n <= 1) {
            return;
        }
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (accounts.get(i).getBalance() < accounts.get(i + 1).getBalance()) {
                Account temp = accounts.get(i);
                accounts.set(i, accounts.get(i + 1));
                accounts.set(i + 1, temp);
                swapped = true;
            }
        }
        if (!swapped) {
            return;
        }
        
        balanceDescendingOrder(accounts, n - 1);
    }


    private static void maximumBalanceAccount(List<Account> accounts) {
        Account maximumBalance = accounts.get(0);
        for (Account account : accounts) {
            if (maximumBalance.getBalance() < account.getBalance()) {
                maximumBalance = account;
            }
        }
        System.out.println(maximumBalance);
    }

    private static void readAccount(Scanner scanner, Random random, int n, List<Account> accounts) {
        System.out.println("Enter the Account Details ");
        for (int i = 0; i < n; i++) {
            System.out.println("Account " + (i + 1));
            int accountNumber = random.nextInt(1000000000);
            System.out.println("Enter the Account Holder Name: ");
            String name = scanner.next();
            System.out.println("Enter the Balance: ");
            double balance = scanner.nextDouble();
            
            accounts.add(new Account(accountNumber, name, balance));
        }
    }

    private static void printAccountDetails(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
