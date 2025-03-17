package com.devlabs.volatil;

public class SynchronizedCounter {
	private int counter=0;
	
	public synchronized void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public static void main(String[] args) throws InterruptedException {
		SynchronizedCounter obj = new SynchronizedCounter();
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<10000; i++)
				obj.increment();
		});
		
		Thread t2 = new Thread(() ->{
			for(int i=0; i<10000; i++)
				obj.increment();
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final Counter: "+obj.getCounter());
	}
}
