package com.devlabs.jdk8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamVsParallel {
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.rangeClosed(1, 100_00_0)
				.boxed()
				.collect(Collectors.toList());
		
		//Regular Stream
		long start1 = System.currentTimeMillis();
		long result1 = numbers.stream()
				.filter(n -> n % 2 == 0)
				.mapToLong(n ->(long)n*n)
				.sum();
		long end1 = System.currentTimeMillis();
		System.out.println("Stream Sum: "+result1);
		System.out.println("Time taken(stream) "+(end1-start1)+" ms");
		
		long start2 = System.currentTimeMillis();
		long result2 = numbers.parallelStream()
				.filter(n -> n % 2 == 0)
				.mapToLong(n -> (long)n*n)
				.sum();
		long end2 = System.currentTimeMillis();
		System.out.println("Parallel Stream sum: "+result2);
		System.out.println("Time taken(parallelStream) "+(end2-start2)+" ms");
	}
}
