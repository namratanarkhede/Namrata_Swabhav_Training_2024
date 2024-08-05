package com.aurionpro.test;

import com.aurionpro.thread.MyThread;

//your thread should wait till any another thread finish its execution
//Thread Priority :
// number between 1 to 10 that decides how much time cpu will allocate to a thread to execute
// thread.setPriority(); //how much time cpu allocate to the thread.
// example : t1 = 4 
// 1 - lowest priority
// 10 - highest priority

// to decide the priority => Thread.MIN_PRIORITY == 1
// Thread.NORM_PRIORITY = 5
// Thread.MAX_PRIORITY = 10
// default priority = 5
// thread.getPriority();

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread1");
		MyThread thread2 = new MyThread("Thread2");
		MyThread thread3 = new MyThread("Thread3");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		for(int i=5; i>0 ;i--) {
			System.out.println(Thread.currentThread().getName()+":" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());

	}

}
