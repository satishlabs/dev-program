package com.devlabs.dp.singleton.breaksingleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton1 {
	public static void main(String[] args) throws Exception  {
		FixSingleton instance1 = FixSingleton.getInstance();
		
		Constructor<FixSingleton> constructor = FixSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		FixSingleton instance2 = constructor.newInstance();
		
		System.out.println("Instance1 : "+instance1.hashCode());
		System.out.println("Instance2 : "+instance2.hashCode());
	}
}
