package com.devlabs.ds.singleton.breaksingleton;

//Fix: Prevent Reflection using Enum or throw an exception in the constructor.
public class FixSingleton {
	private static final FixSingleton instance =new FixSingleton();
	
	private FixSingleton() {
		if(instance != null) { //Prevent Reflection
			throw new RuntimeException("Use getInstance() method");
		}
	}
	
	public static FixSingleton getInstance() {
		return instance;
	}
}
