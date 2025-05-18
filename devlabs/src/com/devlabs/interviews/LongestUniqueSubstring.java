package com.devlabs.interviews;

public class LongestUniqueSubstring {
	public static void main(String[] args) {
		String input = "abcabcbb";
		int length = lengthOfLongestSubstring(input);
		System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
		System.out.println("\n========================");
		String result = getLongestUniqueSubstring(input);
        System.out.println("Longest Substring Without Repeating Characters: \"" + result + "\"");
	}

	private static String getLongestUniqueSubstring(String input) {
		
		return null;
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
