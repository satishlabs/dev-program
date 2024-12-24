package com.devlabs.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
//In CountDownLatch, only main thread waits for other threads to complete their execution, where as in CyclicBarrier
public class CountdownLatchExample2 {
	public static void main(String[] args) throws InterruptedException {
		 // Let us create task that is going to  
        // wait for four threads before it starts 
		CountDownLatch latch = new CountDownLatch(4);
		
		// Let us create four worker  
        // threads and start them. 
		Worker first = new Worker(1000, latch, "WORKER - 1");
		
		Worker second = new Worker(2000, latch, "WORKER - 2");
		
		Worker third = new Worker(3000, latch, "WORKER - 3");
		
		Worker fourth = new Worker(4000, latch, "WORKER - 4");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		// The main task waits for four threads 
		latch.await();
		
		// Main thread has started 
        System.out.println(Thread.currentThread().getName() + 
                           " has finished"); 
	}
}

/*
 Consider a IT world scenario where manager divided modules between development teams (A and B) 
 and he wants to assign it to QA team for testing only when both the teams completes their task.

Here manager thread works as main thread and development team works as worker thread. 
Manager thread waits for development teams thread to complete their task. 
Once developer teams complete their tasks, they will inform manager thread and then manager thread assign modules to QA team.
 * */
