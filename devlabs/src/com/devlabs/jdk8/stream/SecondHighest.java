package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,3,9,6,1,9);
		Optional<Integer> first = 
				numbers
				.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		first.ifPresentOrElse(num ->System.out.println("SecondHighest: "+num), () ->System.out.println("No second hihest found."));
	}
}
