package com.str;

//SubString hello h he hel hell hello e el ell ello l ll llo l lo o

public class SubstringsOfStringMain {
    public static void main(String[] args) {
        String str = "hello";
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
