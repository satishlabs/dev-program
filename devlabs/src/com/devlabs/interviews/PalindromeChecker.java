package com.devlabs.interviews;

public class PalindromeChecker {
	public static void main(String[] args) {
		String[] testInputs = {
	            "madam",
	            "racecar",
	            "A man a plan a canal Panama",
	            "No lemon, no melon",
	            "Hello"
	        };
		for(String input : testInputs) {
			boolean result = isPlaindrome(input);
			System.out.println("\"" + input + "\" is palindrome? " +result);
		}
	}

	private static boolean isPlaindrome(String input) {
		if(input == null) {
			return false;
		}
		
		String cleaned = input.replaceAll("[a-zA-Z]", "").toLowerCase();
		
		int left = 0;
		int right = cleaned.length()-1;
		
		while(left< right) {
			if(cleaned.charAt(left) != cleaned.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}
