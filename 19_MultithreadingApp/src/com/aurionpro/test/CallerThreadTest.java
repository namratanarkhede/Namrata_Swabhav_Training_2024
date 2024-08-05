package com.aurionpro.test;

import com.aurionpro.thread.CallMe;
import com.aurionpro.thread.CallerThread;

public class CallerThreadTest {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		
		CallerThread thread1 = new CallerThread("Hello", target);
		CallerThread thread2 = new CallerThread("Namrata", target);
		CallerThread thread3 = new CallerThread("Aurionpro", target);

		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
