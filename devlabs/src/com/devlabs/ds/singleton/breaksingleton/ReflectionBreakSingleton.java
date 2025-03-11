package com.devlabs.ds.singleton.breaksingleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {
	public static void main(String[] args) throws Exception  {
		Singleton instance1 = Singleton.getInstance();
		
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);// Breaks the private constructor
		Singleton instance2 = constructor.newInstance();
		
		System.out.println("Instance1 : "+instance1.hashCode());
		System.out.println("Instance2 : "+instance2.hashCode()); // Different hashcode = Singleton broken!
	}
}
