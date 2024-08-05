package com.aurionpro.thread;

public class AProducer implements Runnable {

	private final AThreadExample athreadExample;

	public AProducer(AThreadExample athreadExample) {
		this.athreadExample = athreadExample;
		new Thread(this, "Producer ").start();
	}
	@Override
	public void run() {
		
		for(int i = 0; i<5; i++) {
			athreadExample.put(i);
		}
		
	}
	
}
