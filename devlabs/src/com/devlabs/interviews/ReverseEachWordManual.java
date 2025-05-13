package com.devlabs.interviews;

public class ReverseEachWordManual {
	public static void main(String[] args) {
		String input = "Java is fun";
        String output = reverseWordsInPlace(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed words in place: " + output);
	}

	private static String reverseWordsInPlace(String input) {
		if(input == null || input.trim().isEmpty()) {
			return input;
		}
		
		String[] words = input.split("\\s+");
		String result = "";
		for(String word : words) {
			result += reverseWrod(word)+" ";
		}
		return result.toString();
	}
	// Reverse a single word without using StringBuilder or reverse()
	private static String reverseWrod(String word) {
		char[] chars = word.toCharArray();
		int left = 0;
		int right = word.length()-1;
		
		 // Manual reversal using two-pointer technique
		while(left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
}
