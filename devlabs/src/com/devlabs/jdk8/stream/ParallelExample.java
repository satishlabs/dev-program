package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Eve");
		 
		// Using parallelStream
		
		names.parallelStream().forEach(name -> {
			System.out.println(Thread.currentThread().getName()+" processing: "+ name);
		});
	}
}
