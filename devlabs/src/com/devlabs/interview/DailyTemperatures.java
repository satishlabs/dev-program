package com.devlabs.interview;

import java.util.Stack;
/*
 Input:  [73, 74, 75, 71, 69, 72, 76, 73]
Output: [1, 1, 4, 2, 1, 1, 0, 0]
 * */


public class DailyTemperatures {
	public static void main(String[] args) {
		DailyTemperatures dt = new DailyTemperatures();
		int[] temps = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result = dt.dailyTemperatures(temps);

		for (int r : result) {
			System.out.print(r + " ");
		}

	}

	private int[] dailyTemperatures(int[] temp) {
		int n = temp.length;
		int[] ans = new int[n];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
				int prevDay = stack.pop();
				ans[prevDay] = i - prevDay;
			}
			stack.push(i);
		}
		return ans;
	}
}
