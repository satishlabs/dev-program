package com.devlabs.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplocateFromArray {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 7, 4, 5, 2, 9 };

		// 1. Using HashSet – Efficient (Time: O(n), Space: O(n))
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();
		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println("Duplcate Elements: " + duplicates);
		System.out.println("Unique Elements: " + seen);

		System.out.println("\n============================");
		// 2. Brute Force (O(n²)) – Nested Loops
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;// avoid printing same duplicate multiple times
				}
			}
		}

		System.out.println("\n============================");
		// 3. Map-Based – Count Occurrences
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		// System.out.println(map);
		map.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + " " + v);
			}
		});

		System.out.println("\n============================");
		// 4. Map-Based – Count Occurrences
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map1.put(num, map1.getOrDefault(num, 0) + 1);
		}

		System.out.println("Duplicates:");
		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.println("\n============================");
		// 4. Java 8 Streams
		Set<Integer> duplicates1 = Arrays.stream(arr)
			    .boxed() // Convert int to Integer
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			    .entrySet()
			    .stream()
			    .filter(e -> e.getValue() > 1)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toSet());


		        System.out.println("Duplicates: " + duplicates1);
	}
}
