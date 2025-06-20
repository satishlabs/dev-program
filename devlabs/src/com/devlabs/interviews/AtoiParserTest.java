package com.devlabs.interviews;

public class AtoiParserTest {
	public static void main(String[] args) {
		System.out.println(myAtoi("   -42")); // -42
		System.out.println(myAtoi("4193 with words"));// 4193
		System.out.println(myAtoi("words and 987")); // 0
		System.out.println(myAtoi("-91283472332")); // Integer.MIN_VALUE
		System.out.println(myAtoi("+123")); // 123

		System.out.println("\n=========================");
		System.out.println(myAtoiRegexVersion("  +456 with extra")); // 456
		System.out.println("\n=========================");
		System.out.println(AtoiRecursive("  -12345xyz")); // -12345
	}

	private static int AtoiRecursive(String str) {

		return parseHelper(str.trim(), 0, 0, 1, false);
	}

	private static int parseHelper(String str, int index, int acc, int sign, boolean signParsed) {
		if (index >= str.length())
			return acc * sign;

		char ch = str.charAt(index);

		if (!signParsed && (ch == '+' || ch == '-')) {
			sign = (ch == '-') ? -1 : 1;
			return parseHelper(str, index + 1, acc, sign, true);
		}

		if (!Character.isDigit(ch))
			return acc * sign;

		int digit = ch - '0';
		if (acc > (Integer.MAX_VALUE - digit) / 10)
			return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

		return parseHelper(str, index + 1, acc * 10 + digit, sign, true);
	}

	private static int myAtoiRegexVersion(String str) {
		String trimed = str.trim();
		if (trimed.isEmpty())
			return 0;
		String match = trimed.replaceFirst("^([+-]?\\d+).*", "$1");
		try {
			return Integer.parseInt(match);
		} catch (NumberFormatException e) {
			return match.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}
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
