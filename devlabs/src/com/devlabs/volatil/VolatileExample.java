package com.devlabs.volatil;

/*
 The volatile keyword in Java ensures visibility of changes to a variable across threads. 
 It prevents caching and ensures that all threads read the latest value from the main memory instead of from CPU caches.
 * */
public class VolatileExample {
	private static volatile boolean running = true;
	
	public static void main(String[] args) {
		Thread worker = new Thread(() ->{
			while(running) {
				
			}
			System.out.println("Thread stopped...");
		});
		worker.start();
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		running = false;// Change visible immediately to worker thread
		System.out.println("Main Thread Stopped..");
	}
}
