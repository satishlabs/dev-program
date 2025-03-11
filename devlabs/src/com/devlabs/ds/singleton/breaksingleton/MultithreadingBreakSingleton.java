package com.devlabs.ds.singleton.breaksingleton;

class MultiThreadBreakSingleton{
	private static MultiThreadBreakSingleton instance;
	
	private MultiThreadBreakSingleton() {
		
	}
	
	public static MultiThreadBreakSingleton getInstance() {
		if(instance == null) {
			instance = new MultiThreadBreakSingleton();
		}
		return instance;
	}
}

public class MultithreadingBreakSingleton {
	public static void main(String[] args) {
		Runnable task = () ->{
			MultiThreadBreakSingleton instance = MultiThreadBreakSingleton.getInstance();
			System.out.println("Instance hashcode : "+instance.hashCode());
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
	}
}

//Instance hashcode : 1825634139
//Instance hashcode : 1048133207