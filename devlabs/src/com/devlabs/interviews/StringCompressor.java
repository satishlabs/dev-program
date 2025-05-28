package com.devlabs.interviews;

public class StringCompressor {
	public static void main(String[] args) {
		System.out.println(compress("aaabbc")); // a3b2c1
		System.out.println(compress("a")); // a1
		System.out.println(compress("abc")); // a1b1c1
		System.out.println(compress("aaAA")); // a2A2 (case-sensitive

		System.out.println("\n=================");
		System.out.println(compress1("aaabbc")); // a3b2c
		System.out.println(compress1("a")); // a
		System.out.println(compress1("abccc")); // abc3
	}

	public static String compress1(String s) {
		if (s == null || s.isEmpty())
			return "";

		StringBuilder compressed = new StringBuilder();
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				compressed.append(s.charAt(i - 1));
				if (count > 1) {
					compressed.append(count);
				}
				count = 1;
			}
		}

		// Append last character and its count (if > 1)
		compressed.append(s.charAt(s.length() - 1));
		if (count > 1) {
			compressed.append(count);
		}

		return compressed.toString();
	}

	public static String compress(String s) {
		if (s == null || s.isEmpty())
			return "";

		StringBuilder compressed = new StringBuilder();
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				compressed.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Append the last character and its count
		compressed.append(s.charAt(s.length() - 1)).append(count);

		return compressed.toString();
	}
}
