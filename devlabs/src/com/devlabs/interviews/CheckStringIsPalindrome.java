package com.devlabs.interviews;

public class CheckStringIsPalindrome {
	public static void main(String[] args) {
		String str = "Satish";
		if(isStringPlaindrome(str)) {
			System.out.println(str+ " is Palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
	}

	private static boolean isStringPlaindrome(String str) {
		String newStr = str.replaceAll("\\s", "").toLowerCase();
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(newStr.charAt(left) != newStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
