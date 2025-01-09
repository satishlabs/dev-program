package com.dev.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 15, 7};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int start, int end) {
        if(end <= start){
            return; //We are not traversing the array
        }

        int mid = (start + end) / 2;
        sort(arr, start, mid); //Sort left half
        sort(arr, mid + 1, start); // Sort right half
        merge(arr, start, mid, end);    //Merge sorted results into the arr
    }

    private static void merge(int[] arr, int start, int mid, int end) {
       int tempArray[] = new int[end - start + 1];
       int leftSort = start; //index counter for left side of array
       int rightSort = mid + 1; //index counter for right side of array
       int k = 0;
       while(leftSort <= mid && rightSort <= end){
           if(arr[leftSort] < arr[rightSort]){
               tempArray[k] = arr[leftSort];
               leftSort++;
           }else{
               tempArray[k] = arr[rightSort];
               rightSort++;
           }
           k++;
       }
       if(leftSort <= mid){
           while(leftSort <= mid){
               tempArray[k] = arr[leftSort];
               leftSort++;
               k++;
           }
       }else if(rightSort <= end){
           while(rightSort <= end){
               tempArray[k] = arr[rightSort];
               rightSort++;
               k++;
           }
       }
       for(int i=0; i<tempArray.length; i++){
           arr[start + i] = tempArray[i];
       }
    }
}
