package com.devlabs.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LookExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Ankit");
		List<String> result = new ArrayList<String>();

		for (String name : names) {
			if (name.startsWith("A")) {
				result.add(name);
			}
		}
		System.out.println("Result using for loop: " + result);

		System.out.println("---------------------------");
		names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("---------------------------");
		List<String> emails = List.of("john@gmail.com", "amy@yahoo.com", "admin@gmail.com");

		emails.stream().filter(email -> email.endsWith("@gmail.com")).map(String::toUpperCase)
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("---------------------------");
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum: " + sum);

		System.out.println("---------------------------");
		names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("---------------------------");
		names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("---------------------------");
		List<String> data = List.of("A", "B", "C", "D", "E");
		data.parallelStream()
				.forEach(item -> {
					System.out.println(Thread.currentThread().getName()+" -> "+item);
				});
	}

}
