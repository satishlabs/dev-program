package com.devlabs.ds.singleton.breaksingleton;

class PreventSingletonWithMultiThread{
	private static PreventSingletonWithMultiThread instance;
	
	private PreventSingletonWithMultiThread() {
		
	}
	
	public static PreventSingletonWithMultiThread getInstance() {
		if(instance == null) {
			synchronized (PreventSingletonWithMultiThread.class) {
				if(instance == null) {
					instance = new PreventSingletonWithMultiThread();
				}
			}
		}
		return instance;
	}
}

public class PreventSingletonInMultithread {
	public static void main(String[] args) {
		Runnable task = () ->{
			PreventSingletonWithMultiThread instance = PreventSingletonWithMultiThread.getInstance();
			System.out.println("Instance hashcode : "+instance.hashCode());
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
	}
}

//Instance hashcode : 1645679793
//Instance hashcode : 1645679793
