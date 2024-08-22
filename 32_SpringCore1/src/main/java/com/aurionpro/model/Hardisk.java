package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hardisk {
	@Value("10")
	private int capacity;
	
	
	public Hardisk() {
		System.out.println("Inside hardisk default constructor");
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		System.out.println("Capacity is set in Hardisk!");
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
