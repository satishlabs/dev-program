package com.dev.arr;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
        // removeDuplicates1(arr);
        System.out.println("========================");
        int n = arr.length;

        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

    }

    private static int removeDuplicates(int[] arr, int n) {
        Arrays.sort(arr);
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
            arr[j++] = arr[n - 1];

        return j;
    }
}
