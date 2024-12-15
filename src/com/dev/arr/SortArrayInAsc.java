package com.dev.arr;

/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
* */
public class SortArrayInAsc {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        sortArray(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    private static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
