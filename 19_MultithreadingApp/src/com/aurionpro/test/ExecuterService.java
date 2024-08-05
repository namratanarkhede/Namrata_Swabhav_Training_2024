package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

//ExecuterService - > thread pool
//framework for managing and controlling the execution of tasks in multithreaded environment.
//Configuration and control over executing the tasks.
//if we use executerService instead of creating 1 thread for 1 task it creates the threadpool. 
//we can control the number of threads to be execute in thread pool
// CPU intensive task => need to calculate core count i.e processor available.
// I/O intensive task => higher number of threads

// ThreadPool Types:
//1. FixedThreadPool -> 10 fixed when we know how many threads we want to create
//2. CachedThreadPool -> create the threads on requirement.
//3. SingleThreadExecutor -> create only one thread in thread pool
//4. ScheduledThreadPool -> schedule tasks to run based on time delay..


public class ExecuterService {
	public static void main(String[] args) {
		
		int coreCount =Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors : "+coreCount);
		
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i =0; i< 100; i++) {
			service.execute(new Task());
		}
	}

}
