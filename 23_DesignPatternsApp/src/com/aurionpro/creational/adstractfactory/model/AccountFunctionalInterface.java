package com.aurionpro.creational.adstractfactory.model;

@FunctionalInterface
public interface AccountFunctionalInterface {
	IAccount create(String name, Long accountNumber, double totalBalance, double extraParam);
}
