package com.dev.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        removeDuplicates1(new int[] {1, 2, 1, 2, 1, 2, 3});
        removeDuplicates2(new int[] {1, 2, 1, 2, 1, 2, 3});
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
        // removeDuplicates1(arr);
        System.out.println("========================");
        int n = arr.length;

        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

    }

    private static void removeDuplicates2(int[] ints) {
        HashSet set = new HashSet<>();
        for(int i=0; i<ints.length; i++){
            set.add(ints[i]);
        }
        System.out.println(set);
    }

    private static void removeDuplicates1(int[] ints) {
        LinkedHashSet set = new LinkedHashSet<>();
        for(int i=0; i<ints.length; i++){
            set.add(ints[i]);
        }
        System.out.println(set);
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
