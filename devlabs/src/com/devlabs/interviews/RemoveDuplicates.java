package com.devlabs.interviews;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
        
        System.out.println("\n==========================");
        String result = removeDuplicatesWithoutCollection(input);

        System.out.println("Original: " + result);
        System.out.println("Without duplicates: " + result);
	}

	private static String removeDuplicatesWithoutCollection(String input) {
		if(input == null)
			return null;
		
		StringBuilder sb = new StringBuilder();
		boolean[] seen = new boolean[256]; //// Assuming ASCII
		for(char ch : input.toCharArray()) {
			if(!seen[ch]) {
				seen[ch] = true;
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}

	private static String removeDuplicates(String input) {
		if(input == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for(Character ch: input.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
}
