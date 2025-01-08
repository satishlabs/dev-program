package com.dev.arr;

public class FindLogestSubArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};

        // Calculate the longest subarray of 1's after deleting one element
        int result = longestSubarray(nums);
        System.out.println("Longest Subarray of 1's After Deleting One Element: " + result);

    }

    private static int longestSubarray(int[] nums) {
        int start = 0; //Start of the sliding window
        int zeroCount = 0; //Number of zeros in the current window
        int maxLength = 0; //Maximum length of subarray with at most one zero

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }

            //If zeroCount exceeds 1, shrink the window from the left
            while(zeroCount > 1){
                if(nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }

            //Update the maximum length of the window
            maxLength = Math.max(maxLength, i-start+1);
        }
        //Subtract 1 because we must delete one element
        return maxLength-1;
    }
}
