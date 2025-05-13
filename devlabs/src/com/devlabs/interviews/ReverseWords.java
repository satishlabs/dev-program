package com.devlabs.interviews;

public class ReverseWords {
	public static void main(String[] args) {
		String input = "Java is fun";
		String result = reverseWords(input);

		System.out.println("Original sentence: " + input);
		System.out.println("Reversed sentence: " + result);
		System.out.println("\n============================");
		String output = reverseWordsInPlace(input);

		System.out.println("Original: " + input);
		System.out.println("Reversed words in place: " + output);
		System.out.println("\n===============================");
		output = reverseWordsInPlaceManual(input);

		System.out.println("Original: " + input);
		System.out.println("Reversed words in place: " + output);
	}

	private static String reverseWordsInPlaceManual(String input) {
		if (input == null || input.trim().isEmpty()) {
			return input;
		}

		String[] words = input.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			// Manually reverse the word
			for (int i = word.length() - 1; i >= 0; i--) {
				sb.append(word.charAt(i));
			}
			sb.append(" ");// Add space between words
		}
		return sb.toString().trim(); // Trim the trailing space
	}

	private static String reverseWordsInPlace(String input) {
		if (input == null || input.trim().isEmpty()) {
			return input;
		}

		String[] words = input.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(new StringBuilder(word).reverse().append(" "));
		}
		return sb.toString().trim();
	}

	private static String reverseWords(String input) {
		if (input == null || input.trim().isEmpty()) {
			return input;
		}

		String[] words = input.split("\\s+");// Split by one or more spaces
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);

			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
