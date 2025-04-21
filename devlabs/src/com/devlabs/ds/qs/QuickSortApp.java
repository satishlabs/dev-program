package com.devlabs.ds.qs;

import java.util.Arrays;

public class QuickSortApp {
	public static void main(String[] args) {
		int[] arr = {12,81,43,1098,0,8,92,17,754,912,0,6,4};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
		//index position of the correctly placed value in the array
			int q = partition(arr, start, end);
			
			//sorts the left half of the range
			quickSort(arr, start, q-1);
			
			//sorts the right half of the range
			quickSort(arr, q+1, end);
			
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		//in the first iteration , i starts from -1
		int i= start-1;
		for(int j = start; j<=end-1; j++) {
			if(arr[j] <= pivot) {
				i++;
				int ival = arr[i];
				int jval = arr[j];
				arr[i] = jval;
				arr[j] = ival;
			}
			
		}
		//put the pivot value in the correct slot next
		int ival = arr[i+1];
		arr[end] = ival;
		
		//here piovt value placed in the correct slot of the array
		arr[i+1] = pivot;
		return i+1;
	}
}
