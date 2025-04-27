package com.devlabs.interviews;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Satish";
		String reversed = new StringBuilder(str).reverse().toString();

		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);
		System.out.println("\n=============================");

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i); // avoid in big strings, use StringBuilder
		}

		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);

		System.out.println("\n=============================");
		char[] chars = str.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		
		reversed = new String(chars);
		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);
	}
}
