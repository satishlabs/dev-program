package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommonElementsFinder {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java","Python","C++","Go");
		List<String> list2 = Arrays.asList("Ruby","Python","Go","Kotlin");
		try {
			List<String> commonElements = findCommonElements(list1,list2);
			if(commonElements.isEmpty()) {
				System.out.println("No Common Elements found");
			}else {
				System.out.println("Common Elements:");
				for(String element: commonElements) {
					switch (element) {
					case "Java" -> System.out.println("Common Elements: Java" );
					case "Python" -> System.out.println("Common Elements: Python" );
					case "Go" -> System.out.println("Common Elements: Go" );
					case "Kotlin" -> System.out.println("Common Elements: Kotlin" );
					default ->
						throw new IllegalArgumentException("Other comman ELements: " + element);
					}
				}
			}
			
		}catch (IllegalArgumentException e) {
			System.out.println("Input Error: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("Unpexted Error: "+e.getMessage());
		}
	}

	private static List<String> findCommonElements(List<String> list1, List<String> list2) {
		if(list1 == null || list2 == null) {
			throw new IllegalArgumentException("Input lists cannot be null");
		}
		return list1.stream()
				.filter(Objects::nonNull)
				.distinct()
				.filter(list2::contains)
				.collect(Collectors.toList());
	}
}
