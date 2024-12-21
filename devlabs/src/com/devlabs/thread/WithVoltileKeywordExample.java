package com.devlabs.thread;

public class WithVoltileKeywordExample {
	static volatile int x=0, y=0;
	
	public static void method1() {
		x++;
		y++;
	}
	
	public static void method2() {
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
		
		t1.start();
		t2.start();
	}
}
