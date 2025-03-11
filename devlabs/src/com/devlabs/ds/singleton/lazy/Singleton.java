package com.devlabs.ds.singleton.lazy;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInsSingleton() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
