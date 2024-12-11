package com.dev.arr;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an unsorted array arr containing only non-negative integers,
your task is to find a continuous subarray (a contiguous sequence of elements)
whose sum equals a specified value target.
You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.

Examples:

Input: arr[] = [1,2,3,7,5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.

* */
public class FindSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5}; int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result); // Output: [2, 4]
    }
    /*
    Explanation:
Initialize start at 0 and curr_sum at 0.
Iterate end from 0 to the length of the array.
Add arr[end] to curr_sum.
If curr_sum exceeds target, keep moving start forward and subtracting arr[start]
from curr_sum until curr_sum is less than or equal to target.
When curr_sum equals target, return the 1-based indices of start and end.

This solution employs the sliding window technique to efficiently find the subarray that sums to the target. If no such subarray is found, it returns [-1, -1].
    * */

    private static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int start = 0,curr_sum = 0;
        for(int end=0; end<arr.length; end++){
            curr_sum+=arr[end];
            while (curr_sum > target && start <= end) {
                curr_sum-=arr[start];
                start++;
            }
            if(curr_sum == target){
                return new ArrayList<>(Arrays.asList(start+1, end+1));
            }

        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}
