package com.aurionpro.structural.Adapter.model;

public class Biscuit implements IItem{

	private String Name;
	private double price;
	
	public Biscuit(String name, double price) {
		super();
		Name = name;
		this.price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getItemName() {
		return this.Name;
	}

	@Override
	public double getItemPrice() {
		return this.price;
	}

	
}
