package com.devlabs.coll.map;

import java.util.HashMap;

public class HashMapCollisionExample {
	public static void main(String[] args) {
		HashMap<CustomKey, String> map = new HashMap<CustomKey, String>();
		
		for(int i=0; i<=9; i++) {
			map.put(new CustomKey("key"+i), "value "+ i);
		}
		
		map.forEach((key,value) -> System.out.println(key+" ->"+value));
		
		System.out.println("\nHash codes of keys");
		map.keySet().forEach(key -> System.out.println(key+ "-> hashcode: "+key.hashcode()));
	}
}
 