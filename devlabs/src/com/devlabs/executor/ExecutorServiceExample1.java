package com.devlabs.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
	int taskNumber;
	
	MyRunnable(int taskNumber){
		this.taskNumber = taskNumber;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing taks no "+taskNumber);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class ExecutorServiceExample1 {
	
	private static int nTasks = 10;
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		System.out.println("executor created with 2 threads..");
		
		System.out.println("2 threads in executor will be used for executing 10 tasks."+" So, at a time only 2 tasks will be executed");
		for(int i=1; i<= nTasks; i++) {
			Runnable task = new MyRunnable(i);
			executorService.execute(task);
		}
		
		executorService.shutdown();
		System.out.println("executor has been shutDown...");
	}
}
