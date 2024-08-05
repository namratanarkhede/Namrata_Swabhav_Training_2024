package com.aurionpro.thread;

public class AConsumer implements Runnable{

	private final AThreadExample athreadExample;

	public AConsumer(AThreadExample athreadExample) {
		this.athreadExample = athreadExample;
		new Thread(this, "Consumer ").start();
	}
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			athreadExample.get();
		}
		
	}
	

}
