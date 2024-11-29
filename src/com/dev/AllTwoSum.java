package com.dev;

import java.util.Arrays;

public class AllTwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, -2, 5};
        int target = 9;

        findTwoSum(numbers, target);
    }

    private static void findTwoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int l=0;
        int r = numbers.length-1;
           while(l<r){
               if(numbers[l]+numbers[r]==target){
                   System.out.println(numbers[l]+" "+numbers[r]);
                   l++;
                   r--;
               }else if(numbers[l]+numbers[r]<target){
                   l++;
               }else{
                   r--;
               }
           }
       }
}
