package com.devlabs.str;

public class ReverseVowels {
	public static void main(String[] args) {
		String input = "HellOI";
		System.out.println("Original: " + input);
		System.out.println("Reversed Vowels: " + reverseVowels(input));
	}

	private static String reverseVowels(String input) {
		char[] chars = input.toCharArray();
		int left = 0;
		int right = chars.length-1;
		String vowels = "AEIOUaeiou";
		while(left <right) {
			while(left < right && vowels.indexOf(chars[left])==-1) {
				left++;
			}
			
			while(left < right && vowels.indexOf(chars[right]) == -1) {
				right--;
			}
			
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
}
