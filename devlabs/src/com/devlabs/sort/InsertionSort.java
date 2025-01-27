package com.devlabs.sort;

public class InsertionSort {
	public static void main(String[] args) {
			int arr[]=insertionSort(new int[] {9,8,13,87,12,99});
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}

	}

	private static int[] insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int element = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		return arr;
	}
}
