package com.devlabs.ds.qs;

public class QuickSortExample {
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted array");
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivot = partition(arr, low , high);  // index of pivot
			quickSort(arr, low, pivot-1); //Left side
			quickSort(arr, pivot+1, high); //Right side
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];// choose last element as pivot
		int i = low-1; // pointer for smaller element
		
		for(int j=low; j< high; j++) {
			if(arr[j] < pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp  = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		 // swap pivot to the right position
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
