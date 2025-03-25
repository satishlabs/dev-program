package com.devlabs.coll.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastExamples {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("A","B","C"));
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add("D");
		}
	}
}
