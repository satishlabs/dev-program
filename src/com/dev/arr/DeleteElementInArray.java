package com.dev.arr;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int arr[] ={10,20,40,80,55};
        int del = 40;
        deleteElement(arr, del);
        System.out.println("-------------");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } //O(n)
    }

    private static void deleteElement(int[] arr, int del) {
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == del){
                index = i;
                break;
            }
        }
        if(index == -1){
            return;
        }

        for(int i=index; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=0;
    }
}
