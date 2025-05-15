package com.devlabs.interviews;

public class AnagramChecker {
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagram.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}

	private static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] counts = new int[26]; // for a to z

		for (int i = 0; i < str1.length(); i++) {
			counts[str1.charAt(i) - 'a']++; // increment for str1;
			counts[str2.charAt(i) - 'a']--; // increment for str2
		}
		// If all counts are zero, they are anagrams
		for (int count : counts) {
			if (count != 0)
				return false;
		}
		return true;
	}
}
