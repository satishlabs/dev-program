package com.devlabs.thread;

public class WithSynchronizedKeywordExample {
	static int x=0, y=0;
	
	/*
	 Using synchronized keyword will help updating x and y in order. 
	 Because of synchronization used against method we ensures that both methods are not called concurrently. 
	 Therefore, during execution of method2() x and y will be always equal.
	 * */
	static synchronized void method1() {
		x++;
		y++;
	}
	
	static synchronized void method2() {
		System.out.println("X= "+x+" Y= "+y);
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
		
		t1.start();
		t2.start();
	}
}
