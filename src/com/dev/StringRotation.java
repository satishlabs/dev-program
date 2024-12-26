package com.dev;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println(isRotation(str1, str2));
    }

    private static boolean isRotation(String str1, String str2) {
        // Check if lengths are the same and non-empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }
        // Concatenate str1 with itselfgit
        String str3 = str1 + str1;

        // Check if str2 is a substring of str3 string
        return str3.contains(str2);
    }
}
