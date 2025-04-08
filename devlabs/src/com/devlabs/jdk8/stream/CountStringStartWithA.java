package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringStartWithA {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","Banana","Avocado");
		strList.stream().filter(str -> str.startsWith("A"))
			.collect(Collectors.toList()).forEach(System.out::println);
	}
}
