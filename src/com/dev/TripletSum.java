package com.dev;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, 2, -3, 1, 3, -2};
        int sum = 0;
        int n = arr.length;
        findTripletCombination(arr, n, sum);
    }

    public static void findTripletCombination(int[] arr, int n, int sum) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == sum) {
                    System.out.println(x + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;
                } else if (x + arr[l] + arr[r] < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}