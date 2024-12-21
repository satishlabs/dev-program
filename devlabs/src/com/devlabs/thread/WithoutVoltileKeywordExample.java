package com.devlabs.thread;

public class WithoutVoltileKeywordExample {
	static int x=0, y=0;
	static void method1() {
		x++;
		y++;
	}
	
	static void method2() {
		System.out.println("X ="+x+" Y ="+y);
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					method1();
				}
			}
		};
		
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					method2();
				}
			}
		};
		/*
		 We will create method1() which will be called repeatedly called by thread1 & 
method2() which will be called repeatedly called by thread2.

then method two could occasionally print a value for x that is greater than the value of y, because neither synchronization nor volatile is used.
 The shared values of x and y might be updated out of order.
		 * */
		
		t1.start();
		t2.start();
	}
}
