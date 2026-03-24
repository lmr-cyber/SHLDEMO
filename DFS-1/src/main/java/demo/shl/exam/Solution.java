package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().trim().split(" ");
        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);

        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        scanner.close();

        int maxArea = findLargestHouse(grid, rows, cols);
        System.out.println(maxArea);
    }

    /**
     * Find the area of the largest house using DFS.
     * A house is a cluster of adjacent 1s (up/down/left/right).
     */
    public static int findLargestHouse(int[][] grid, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = dfs(grid, i, j, visited, rows, cols);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    /**
     * DFS to calculate the area of a house starting from (row, col).
     */
    private static int dfs(int[][] grid, int row, int col, boolean[][] visited, int rows, int cols) {
        // Check boundaries and if cell is part of a house
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        }
        if (visited[row][col] || grid[row][col] == 0) {
            return 0;
        }

        visited[row][col] = true;

        // Explore all 4 directions (up, down, left, right)
        int area = 1;
        area += dfs(grid, row - 1, col, visited, rows, cols); // up
        area += dfs(grid, row + 1, col, visited, rows, cols); // down
        area += dfs(grid, row, col - 1, visited, rows, cols); // left
        area += dfs(grid, row, col + 1, visited, rows, cols); // right

        return area;
    }
}