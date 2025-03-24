package com.devlabs.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable's run");
		
	}
	
}
public class ExecutorServiceExample2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Future<Integer> futureInteger = executorService.submit(new MyRunnable1(),1);
		System.out.println("futureInteger.get() > "+futureInteger.get());
		
		Future<?> future = executorService.submit(new MyRunnable1());
		System.out.println("future get() > "+future.get());
	}
}
