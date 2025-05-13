package com.devlabs.interviews;

public class ReverseWords {
	public static void main(String[] args) {
		String input = "Java is fun";
        String result = reverseWords(input);

        System.out.println("Original sentence: " + input);
        System.out.println("Reversed sentence: " + result);
	}

	private static String reverseWords(String input) {
		if(input == null ||input.trim().isEmpty()) {
			return input;
		}
		
		
		String[] words = input.split("\\s+");// Split by one or more spaces
		StringBuilder sb = new StringBuilder();
		for(int i = words.length-1; i>=0; i--) {
			sb.append(words[i]);
			
			if(i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}
