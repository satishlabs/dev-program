package com.dev.arr;

public class FindDoubleSumInArray {
    public static void main(String[] args) {
        int arr[] = {10, 4, 8, 13, 5, 6, 12};
        int sum = 18;
        findDoubleSum(arr, sum);
        System.out.println("-----------------");
        findAllPairs(arr, sum);
        System.out.println("-----------------");
        findAllPairsNumber(arr, sum);
    }

    private static void findAllPairsNumber(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Sum found of " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    private static void findAllPairs(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j);
                }
            }
        }
    }

    private static void findDoubleSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}
