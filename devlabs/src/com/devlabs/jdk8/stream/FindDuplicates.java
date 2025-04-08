package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange","banana");
        List<String> duplicates = list.stream()
        			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        			.entrySet().stream()
        			.filter(entry -> entry.getValue()>1)
        			.map(Map.Entry::getKey)
        			.collect(Collectors.toList());
        
        System.out.println("Duplicates: "+duplicates);
	}
}
