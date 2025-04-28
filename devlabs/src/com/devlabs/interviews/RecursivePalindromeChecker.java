package com.devlabs.interviews;

public class RecursivePalindromeChecker {
	public static void main(String[] args) {
		String[] testInputs = { "madam", "racecar", "A man a plan a canal Panama", "No lemon, no melon", "Hello" };
		for (String input : testInputs) {
			boolean result = isPalindrome(input);
			System.out.println("\"" + input + "\" is plaindrome? " + result);
		}
	}

	private static boolean isPalindrome(String input) {
		if (input == null) {
			return false;
		}

		// Clean the input: remove non-alphanumeric characters and convert to lowercase
		String cleaned = input.replaceAll("[a-zA-Z]", "").toLowerCase();

		// Call the recursive helper method
		return isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
	}

	private static boolean isPalindromeRecursive(String str, int left, int right) {
		// Base case: If the pointers have crossed, it's a palindrome
		if (left >= right) {
			return true;
		}

		// If characters don't match, not a palindrome
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
		// Move towards the center
		return isPalindromeRecursive(str, left + 1, right - 1);
	}
}
