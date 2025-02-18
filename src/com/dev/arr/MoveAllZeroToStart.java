package com.dev.arr;

public class MoveAllZeroToStart {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 1, 0, 0, 9};
        moveZeroToStart(arr);
        System.out.println();
        moveZeroToStartWithProperWay(arr);
    }

    private static void moveZeroToStartWithProperWay(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
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

    private static void moveZeroToStart(int[] arr) {
        int count = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[count--] = arr[i];
            }
        }
        while (count >= 0) {
            arr[count--] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
