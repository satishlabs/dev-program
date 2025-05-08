package com.devlabs.interviews;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharachter {
	public static void main(String[] args) {
		String input = "swiss";
		Character result = findFirstNonRepeatingChar(input);

		if (result != null) {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating characters found.");
		}

		System.out.println("\n==========================");
		String str = "character count!";
		countCharacterOccurrences(str);
	}

	private static void countCharacterOccurrences(String input) {
		if (input == null || input.isEmpty()) {
			System.out.println("Input string is empty.");
			return;
		}
		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Character frequencies:");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
		}

	}

	private static Character findFirstNonRepeatingChar(String input) {
		if (input == null)
			return null;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// Count frequency of each character
		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Find the first character with frequency 1
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;// No non-repeating character
	}
}
