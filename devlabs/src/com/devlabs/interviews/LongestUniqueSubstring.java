package com.devlabs.interviews;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
	public static void main(String[] args) {
		String input = "abcabcbb";
		int length = lengthOfLongestSubstring(input);
		System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
		System.out.println("\n========================");
		String str = "абвгдabc😀🐱‍👤😀";
		String result = getLongestUniqueSubstring(str);
		System.out.println("Longest Substring Without Repeating Characters: \"" + result + "\"");
		System.out.println("\n========================");
		input = "aAbBcCDeeF";
		result = getLongestUniqueSubstringCaseInsenitive(input);
		System.out.println("Case-Insensitive Longest Unique Substring: \"" + result + "\"");
	}

	public static String getLongestUniqueSubstringCaseInsenitive(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int start = 0, maxStart = 0, maxLen = 0;

		for (int end = 0; end < s.length(); end++) {
			char ch = Character.toLowerCase(s.charAt(end));

			if (map.containsKey(ch) && map.get(ch) >= start) {
				start = map.get(ch) + 1;
			}

			map.put(ch, end);

			if (end - start + 1 > maxLen) {
				maxLen = end - start + 1;
				maxStart = start;
			}
		}

		return s.substring(maxStart, maxStart + maxLen);
	}

	public static String getLongestUniqueSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int start = 0, maxStart = 0, maxLen = 0;

		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);

			if (map.containsKey(ch) && map.get(ch) >= start) {
				start = map.get(ch) + 1;
			}

			map.put(ch, end);

			if (end - start + 1 > maxLen) {
				maxLen = end - start + 1;
				maxStart = start;
			}
		}

		return s.substring(maxStart, maxStart + maxLen);
	}

	private static int lengthOfLongestSubstring(String input) {
		int index[] = new int[256]; // ASCII character map
		for (int i = 0; i < 256; i++) {
			index[i] = -1; // initialize all characters as not seen
		}

		int maxLen = 0;
		int start = 0; // left end of the window
		for (int end = 0; end < input.length(); end++) {
			char current = input.charAt(end);

			if (index[current] >= start) {
				// character already seen in current window
				start = index[current] + 1;
			}

			index[current] = end; // update last seen index
			maxLen = Math.max(maxLen, end - start + 1);
		}
		return maxLen;
	}
}
