package com.dev.arr;
//Input: 1,3,20,14,11,10,21
public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = {1,3,20,14,11,10,21};
        int peakElement = findPeakElement(arr);
        System.out.println(peakElement);

    }

    public static int findPeakElement(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return arr.length+1;
    }
}
