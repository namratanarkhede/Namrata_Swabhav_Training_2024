package com.aurionpro.test;

import com.aurionpro.thread.AConsumer;
import com.aurionpro.thread.AProducer;
import com.aurionpro.thread.AThreadExample;

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		AThreadExample athreadExample = new AThreadExample();
		new AProducer(athreadExample);
		new AConsumer(athreadExample);
		
	}

}
