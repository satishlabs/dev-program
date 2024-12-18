package com.str;

public class PalindromCheck {
    public static void main(String[] args) {
        String str = "abcba";
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
