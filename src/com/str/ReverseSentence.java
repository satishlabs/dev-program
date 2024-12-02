package com.str;

import java.util.StringTokenizer;
//First Charachter of word:

public class ReverseSentence {
    public static void main(String[] args) {
        String str="hello how are you and how is going";
        String str1 = reverse(str);
        System.out.println(str1);
        System.out.println(" ==========");
        StringTokenizer st = new StringTokenizer(str1, " ");
        while(st.hasMoreTokens()){
            String word = st.nextToken();
           // char firstChar = word.charAt(0);
            System.out.println(word+" "+word.charAt(0));
        }

    }
            public static String str4="";
            private static String reverse(String str) {
                String[] str3 = str.split(" ");
                for(int i=str3.length-1; i>=0; i--){
                    str4=str4+" "+str3[i];
                }
                return str4;
            }

    //write the test cases for above class
}
