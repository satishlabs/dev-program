package com.dev.arr;

import java.util.HashSet;

public class SortTheArray {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,2,0,1,0,1};
        sortArray(arr, arr.length);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("-----------------");
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);

    }

    private static void sortArray(int[] arr, int length) {
        for(int i=1; i<length; i++){
            int j=i;
            int k = arr[i];
            while(j>0 && arr[j-1]>k){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = k;
        }
    }
}
