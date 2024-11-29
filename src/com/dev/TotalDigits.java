package com.dev;

import java.util.stream.IntStream;

/*
1…9=9
10,11,12,13=8
9+8=17
Output: 17
 */
public class TotalDigits {
    public static void main(String[] args) {
        int n= 13;
        System.out.println(totalDigits(n));
        int totalDigits = IntStream.rangeClosed(1,13)
                .map(p -> Integer.toString(p).length())
                .sum();
        System.out.println(totalDigits);
        System.out.println("========================");
        int totalD=0;
        for(int i=1; i<=n; i++){
            totalD+=Integer.toString(i).length();
        }
        System.out.println("total: "+totalD);

    }

    private static int totalDigits(int n) {
        int count=0;
        for(int i=1; i<=n; i*=10){
            count+=(n-i+1);
        }
        return count;
    }
}
