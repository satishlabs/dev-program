package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(num -> num%2 == 0));
		System.out.println("Even Numbers: "+collect.get(true));
		System.out.println("Odd Numbers: "+collect.get(false));
	}
}
