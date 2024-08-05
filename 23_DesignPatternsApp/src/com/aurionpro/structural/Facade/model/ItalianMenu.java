package com.aurionpro.structural.Facade.model;

public class ItalianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("------------Italian Menu---------------");
		System.out.println("--------------------------------------");
		System.out.println("Snacks");
		System.out.println("Pasta" + "\t 340 Rs");
		System.out.println("Pizza" + "\t 240 Rs");
		System.out.println("Garlic bread"+ "\t200Rs");
		
		System.out.println("Drinks");
		System.out.println("Wine" + "\t 190 Rs");
		System.out.println("Water" + " \t 50 Rs");
		System.out.println("Mojito " + " \t 150 Rs");
		System.out.println("Cold Coffee" + " \t 120 Rs");
		
		System.out.println("Dessert");
		System.out.println("Brownie" + "\t 300 Rs");
	}
	

}
