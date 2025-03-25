package com.devlabs.coll.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

/*
 It maintains an immutable copy of the list.

When a modification happens (add(), set(), remove()):

It creates a new array.

Copies the old elements into it.

Performs the modification on the new copy.

Replaces the old reference with the new array.

Iterators work on the old snapshot (fail-safe behavior) and do not throw ConcurrentModificationException.
 * */

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(String s: list) {
			System.out.println(s);
			list.add("D");// No ConcurrentModificationException
		}
		
		System.out.println("Final List: "+list);
	}
}
/*
 Internal Working of add("D")
A new array is created [A, B, C, D].

The iterator still sees the old array [A, B, C].

After iteration, the new array is used.

Safe for concurrent reading, but costly for frequent writes.


 
 * */
 