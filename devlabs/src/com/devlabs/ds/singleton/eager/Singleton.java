package com.devlabs.ds.singleton.eager;

public class Singleton {
	private static final Singleton SINGLETON = new Singleton(); //instances created eagerly
	
	private Singleton() {}; //private constructor
	
	public static Singleton getSingleton() {
		return SINGLETON; //Return the single instance
	}
}
