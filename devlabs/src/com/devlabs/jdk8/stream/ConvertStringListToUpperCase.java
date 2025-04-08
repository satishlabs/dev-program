package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class ConvertStringListToUpperCase {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Satish","Prasad","Kaushik");
		strList.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
