package com.dev.arr;
/*
You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
This array represents a permutation of the integers from 1 to n with one element missing.
Your task is to identify and return the missing element.

* */
public class FindMissingNumber {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,5};
        int arr[] = {8,2,4,5,3,7,1};
        int res = findMissingNumber(arr);
        System.out.println(res);
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arrSum = 0;
        for(int num: arr){
            arrSum += num;
        } //for loop ends (O(n
        return totalSum-arrSum;
    }
}
