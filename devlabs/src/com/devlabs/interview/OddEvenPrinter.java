package com.devlabs.interview;
/*
 Print 1 to 20 numbers using two different threads concurrently.
Thread 1 prints 1, 3, 5, 7,…,19
Thread 2 prints 2, 4, 6, 8,…,20

 * */
public class OddEvenPrinter {
	private static final Object lock = new Object();
	private static int number = 1;
	public static void main(String[] args) {
		
		Thread oddThread = new Thread(() ->{
			while(number <= 20) {
				synchronized (lock) {
					if(number%2 == 0) {
						System.out.println("Odd Thread: "+number++);
						lock.notify();
					}else {
						try {
							lock.wait();
						}catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		});
		
		Thread evenThread = new Thread(() -> {
			while(number <= 20) {
				synchronized (lock) {
					if(number%2!=0) {
						System.out.println("Even Thread: "+number++);
						lock.notify();
					}else {
						try {
							lock.wait();
						}catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		});
		
		oddThread.start();
		evenThread.start();
	}
}
