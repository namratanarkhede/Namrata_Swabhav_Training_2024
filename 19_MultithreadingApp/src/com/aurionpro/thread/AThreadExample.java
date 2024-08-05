package com.aurionpro.thread;

public class AThreadExample {
	
	private int value;
	private boolean valueSet = false;
	
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : " + value);
		valueSet = false;
		notify();
		return value;
	}
	
	synchronized void put(int newValue) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		this.value = newValue;
		valueSet = true;
		System.out.println("Produced : " + newValue);
		notify();
	}
}
