package com.devlabs.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{
	/*
	 There might be situation where we might like our thread to wait until one or more threads completes certain operation. 

A CountDownLatch is initialized with a given count . 
count specifies the number of events that must occur before latch is released.
Every time a event happens count is reduced by 1. Once count reaches 0 latch is released.
	 * */
	CountDownLatch countDownLatch;
	//In CountDownLatch, only main thread waits for other threads to complete their execution
	
	public MyRunnable(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}


	@Override
	public void run() {
		for(int i=2; i>=0; i--) {
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName()+" has reduced latch count to  :"+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
