package com.aurionpro.test;

import com.aurionpro.model.Task;

//created the 10 thread to execute 10 tasks
//ExecuterService - > thread pool
// if we use executerService instead of creating 1 thread for 1 task it creates the threadpool. 
// we can control the number of threads to be execute in thread pool
public class TaskTest {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Task());
	
			thread.setName("MyThread"+(i+1));
			thread.start();
		}
	}

}
