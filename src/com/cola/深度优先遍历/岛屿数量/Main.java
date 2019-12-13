package com.cola.深度优先遍历.岛屿数量;

/**
 * Author:cola
 * Date:2019/9/29
 * leetcode 200
 */
public class Main {
    int m, n;
    int count = 0;
    boolean[][] mark;
    int[][] coordinate = {
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
    };

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        mark = new boolean[m][n];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (mark[i][j] == false && grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int x, int y) {

        mark[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newx = x + coordinate[i][0];
            int newy = y + coordinate[i][1];

            if (newx < m && newx >= 0 && newy < n && newy >= 0 && !mark[newx][newy] && grid[newx][newy] == '1') {
                dfs(grid, newx, newy);
            }
        }
    }

    public static void main(String[] args) {

    }
}
