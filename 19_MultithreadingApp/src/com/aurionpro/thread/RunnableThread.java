package com.aurionpro.thread;

//Give multiple facilities if we use the runnable interface
public class RunnableThread implements Runnable{

	private Thread thread;
	
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	
	public RunnableThread(String name) {
	
		thread = new Thread(this);
		thread.start();
		thread.getName();
		
	}
	@Override
	public void run() {
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
