package com.devlabs.weakref;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	public static void main(String[] args) {
		Map<Object, String> weakMap = new WeakHashMap<>();
		Object key1 = new Object();
		weakMap.put(key1, "Value1");
		
		System.out.println("Before GC: "+weakMap);
		
		key1 = null; //Remove strong reference
		System.gc();
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After GC: "+weakMap); //Entry might be gone
	}
}
