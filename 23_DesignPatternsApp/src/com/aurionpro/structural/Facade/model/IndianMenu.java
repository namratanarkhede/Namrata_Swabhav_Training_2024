package com.aurionpro.structural.Facade.model;

public class IndianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("------------Indian Menu---------------");
		System.out.println("--------------------------------------");
		System.out.println("Starters");
		System.out.println("chicken sukka"+ "\t 250 Rs ");
		System.out.println("Tandoori fry" + " \t 310 Rs ");
		System.out.println("Paneer sathe " + "\t 250 Rs");
		System.out.println("Chicken 65 " + "\t 250 Rs");
		
		System.out.println("Main Course");
		System.out.println("kolhapuri chicken"+ "\t 310 Rs ");
		System.out.println("Chicken Gray " + " \t 340 Rs");
		System.out.println("Chicken Tikka " + " \t 350 Rs");
		
		System.out.println("Roti");
		System.out.println("Nan" + " \t 40 Rs per");
		System.out.println("Butter Roti" + "\t 35 Rs");
		System.out.println("bhakari"+ "\t 35 Rs per ");
	}
	

}
