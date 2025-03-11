package com.devlabs.ds.singleton.eager;

/*
 Uses synchronized to make it thread-safe.
Slower because every call to getInstance() is synchronized.
 * */
public class Singleton1 {
	private static Singleton1 instance;
	
	private Singleton1() {
		
	}
	
	public static synchronized Singleton1 getSingleton1() {
		if(instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
