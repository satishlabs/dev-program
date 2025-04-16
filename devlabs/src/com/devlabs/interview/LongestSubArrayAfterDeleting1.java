package com.devlabs.interview;

public class LongestSubArrayAfterDeleting1 {
	public static void main(String[] args) {
		// Test cases
		int[] nums = {1,1,1};
        int[] nums1 = {1, 1, 0, 1}; // Expected output: 3
        int[] nums2 = {1, 1, 1, 1}; // Expected output: 3 (must delete one)
        int[] nums3 = {0, 1, 1, 1, 0, 1, 1, 0, 1}; // Expected output: 4
        int[] nums4 = {0,1,1};
        int[] nums5 = {0,1,0};
        
        System.out.println("Output for [1,1,1]: " + longestSubarray(nums));

        System.out.println("Output for [1,1,0,1]: " + longestSubarray(nums1));
        System.out.println("Output for [1,1,1,1]: " + longestSubarray(nums2));
        System.out.println("Output for [0,1,1,1,0,1,1,0,1]: " + longestSubarray(nums3));
        System.out.println("Output for [0,1,1]: " + longestSubarray(nums4));
        System.out.println("Output for [0,1,0]: " + longestSubarray(nums5));
	}

	private static int longestSubarray(int[] nums) {
		 int left = 0, zeroCount = 0, maxLength = 0;
		 
		 for (int right = 0; right < nums.length; right++) {
	            if (nums[right] == 0) {
	                zeroCount++;
	            }
	            // If there are more than one zero, move left pointer
	            while (zeroCount > 1) {
	                if (nums[left] == 0) {
	                    zeroCount--;
	                }
	                left++;
	            }
	            // Calculate max length (exclude one element)
	            maxLength = Math.max(maxLength, right - left);
		 }
		return maxLength;
	}
}
