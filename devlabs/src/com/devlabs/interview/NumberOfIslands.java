package com.devlabs.interview;

public class NumberOfIslands {
	public int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;
		int m = grid.length;
		int n = grid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					maxArea = Math.max(maxArea, dfs(grid, i, j));
				}
			}
		}

		return maxArea;
	}

	private int dfs(int[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
			return 0;
		}

		grid[i][j] = 0; // mark visited
		int area = 1;

		area += dfs(grid, i + 1, j);
		area += dfs(grid, i - 1, j);
		area += dfs(grid, i, j + 1);
		area += dfs(grid, i, j - 1);

		return area;
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		NumberOfIslands sol = new NumberOfIslands();
		int maxArea = sol.maxAreaOfIsland(grid);
		System.out.println("Max Area of Island: " + maxArea); // Output: 6
	}
}
