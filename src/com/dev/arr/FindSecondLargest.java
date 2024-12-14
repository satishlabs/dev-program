package com.dev.arr;

public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,35,1};
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
        int secondLargest = Integer.MIN_VALUE;

        // Traverse array to find first and second largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
