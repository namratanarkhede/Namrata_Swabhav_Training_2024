package com.aurionpro.model;

public class Hardisk {
	
	private int capacity;
	
	
	public Hardisk() {
		System.out.println("Inside tehe default constructor");
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		System.out.println("Capacity is set!");
		this.capacity = capacity;
	}

	public Hardisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Hardisk [capacity=" + capacity + "]";
	}
	
	

}
