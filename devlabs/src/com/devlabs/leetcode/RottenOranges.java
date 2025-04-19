package com.devlabs.leetcode;

import java.util.*;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Count fresh oranges and add all rotten oranges to the queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }

        // Directions: up, down, left, right
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        int minutes = 0;

        // Step 2: BFS rotting process
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                for (int[] dir : directions) {
                    int newRow = pos[0] + dir[0];
                    int newCol = pos[1] + dir[1];

                    if (newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow, newCol});
                        freshCount--;
                    }
                }
            }
            minutes++; // increment minutes after each level
        }

        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        RottenOranges sol = new RottenOranges();
        int[][] grid1 = {{2,1,1},{1,1,0},{0,1,1}};
        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println("Output 1: " + sol.orangesRotting(grid1)); // 4
        System.out.println("Output 2: " + sol.orangesRotting(grid2)); // -1
    }
}

