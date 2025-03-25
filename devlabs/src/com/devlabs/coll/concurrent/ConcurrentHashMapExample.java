package com.devlabs.coll.concurrent;

import java.util.concurrent.ConcurrentHashMap;
/*
 Bucket-based storage similar to HashMap, but with multiple locks.

Uses CAS (Compare-And-Swap) operations for atomic updates.

Does not lock the entire map when updating.

Uses internal segmentation to handle concurrent modifications efficiently.
 * */
public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		for (Integer key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
			map.put(4, "Four"); // No ConcurrentModificationException
		}

		System.out.println("Final Map: " + map);
	}
}

/*
 Internal Working of put(4, "Four")
The map is divided into 16 segments by default.

Each segment acts as an independent lockable bucket.

put(4, "Four") locks only one bucket, allowing other threads to operate on different segments concurrently.

The iterator sees a consistent snapshot and does not fail.
 * */
