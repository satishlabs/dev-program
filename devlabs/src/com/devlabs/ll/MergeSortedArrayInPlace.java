package com.devlabs.ll;

/*
 Find the intersection of two singly linked list? 
For Example, 
    First LinkedList       :  1 -> 2 -> 3 -> 4 -> 5
    Second LinkedList :  10 -> 9 -> 8 -> 7 -> 4 -> 5 
 * 
 Variant 2: Merge into the first array (LeetCode-style)
You are given:

nums1 with size m + n, where first m elements are valid, rest are 0s

nums2 with size n

Merge nums2 into nums1 in-place, sorted
 * */
public class MergeSortedArrayInPlace {
	public static void main(String[] args) {
		MergeSortedArrayInPlace merger = new MergeSortedArrayInPlace();
		int nums1[] = { 1, 2, 3, 4, 5 };
		int nums2[] = { 10, 9, 8, 7, 4, 5 };
		merger.merge(nums1, nums1.length, nums2, nums2.length);
		System.out.println(nums1);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // Last index of nums1's actual elements
		int j = n - 1; // Last index of nums2
		int k = m + n - 1; // End of nums1 array

		// Merge from the end
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}

		// If any remaining in nums2
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
}
