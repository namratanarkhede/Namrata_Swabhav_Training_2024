package com.aurionpro.test;
	
	//Thread => Life cycle of thread
	// 1. extending thread class
	// class Mythread extends Thread{
	//
	// }
	// MyThread t1 = new MyThread();
	
	//2. implementing a runnable interface
	// public void run() method is compulsory to implement
	
	//3. implementing Callable interface
	//  public int call() method is compulsory to implement.

public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		//Thread[main,5,main]
		//main = name of thread
		//5 = priority
		//main = thread group
		thread.setName("thread1");
		System.out.println(thread);

		thread.isAlive();
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
