package com.devlabs.interview;

//Find Number in row wise and column wise sorted matrix

public class SearchInSortedMatrix {
	public static void main(String[] args) {
		int[][] matrix= {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		int target=29;
		searchMatrix(matrix, target);
	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		int row = 0;
		int col = matrix[0].length-1;
		
		while(row < matrix.length && col >= 0) {
			if(matrix[row][col] == target) {
				System.out.println("Found at ("+row+", "+col +")");
				return true;
			}else if(matrix[row][col] > target) {
				col--;
			}else {
				row++;
			}
		}
		System.out.println("Not found");
		return false;
	}
}
