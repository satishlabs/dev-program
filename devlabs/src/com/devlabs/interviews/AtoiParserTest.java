package com.devlabs.interviews;

public class AtoiParserTest {
	public static void main(String[] args) {
		System.out.println(myAtoi("   -42")); // -42
		System.out.println(myAtoi("4193 with words"));// 4193
		System.out.println(myAtoi("words and 987")); // 0
		System.out.println(myAtoi("-91283472332")); // Integer.MIN_VALUE
		System.out.println(myAtoi("+123")); // 123
	}

	private static int myAtoi(String str) {
		if (str == null || str.isEmpty())
			return 0;

		int i = 0;
		int n = str.length();
		while (i < n && str.charAt(i) == ' ')
			i++;

		if (i == n)
			return 0;

		// Check for optional '+' or '-' sign
		int sign = 1;
		if (str.charAt(i) == '+' || str.charAt(i) == '-') {
			sign = (str.charAt(i) == '-') ? -1 : 1;
			i++;
		}

		int result = 0;
		while (i < n && Character.isDigit(str.charAt(i))) {
			int digit = str.charAt(i) - '0';

			if (result > (Integer.MAX_VALUE - digit) / 10) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			result = result * 10 + digit;
			i++;
		}
		return result * sign;
	}
}
