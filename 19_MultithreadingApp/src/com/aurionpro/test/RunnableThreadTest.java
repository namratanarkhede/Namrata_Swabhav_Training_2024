package com.aurionpro.test;

import com.aurionpro.thread.RunnableThread;

public class RunnableThreadTest {
	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread("thread1");
		//Thread thread2  = new Thread(new RunnableThread());
		//thread2.start();
		
		try {
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName()+":" + i);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
