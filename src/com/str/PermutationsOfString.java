package com.str;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str= "JSP";
        permutation(str,"");
    }

    private static void permutation(String str, String input) {
        if(str.length() == 0){
            System.out.println(input);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            permutation(ros, input + ch);
        }
    }
}
