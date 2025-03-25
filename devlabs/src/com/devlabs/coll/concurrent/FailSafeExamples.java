package com.devlabs.coll.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExamples {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>(new String[] {"A","B","C"});
		for(String s: list) {
			System.out.println(s);
			list.add("D");
		}
		
		System.out.println("Final List: "+list);
	}
}
