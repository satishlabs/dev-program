package com.dev.arr;
/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
* */
public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,35,1,20};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
    }

private static int findSecondLargest(int[] arr) {
        int n = arr.length;
        // If array has less than 2 elements, return -1
        if (n < 2) {
            return -1;
        }

        // Initialize first and second largest
        int largest = arr[0];
        int secondLargest =  arr[0];

        // Traverse array to find first and second largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Check if second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}
