package com.dev.arr;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 1, 0, 0, 9};
        moveZeroToEnd(arr);

        moveZeroToEndWithProperWay(arr);

    }

    private static void moveZeroToEndWithProperWay(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
