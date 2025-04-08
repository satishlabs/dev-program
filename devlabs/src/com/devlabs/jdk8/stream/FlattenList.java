package com.devlabs.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
				Arrays.asList("A","B"),
				Arrays.asList("C","D")
				);
		
		List<String> collect = names.stream().flatMap(List:: stream)
			.collect(Collectors.toList());
		
		System.out.println(collect);
		System.out.println("\n==========================");
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("B");
		List<String> l2 = new ArrayList<String>();
		l2.add("C");
		l2.add("D");
		//l1.addAll(l1);
		List<List<String>> nestedList = Arrays.asList(l1, l2);

        List<String> flatList = nestedList.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        System.out.println(flatList);
		
	}
}
