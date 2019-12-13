package com.cola.深度优先遍历.最小路径和;

/**
 * Author:cola
 * Date:2019/10/16
 * leetcode 64
 */
public class Main {
    boolean[][] flag;
    int min = 9999999;

    //只能向下或者向右
    int[][] coordinate = {
            {0, 1},
            {1, 0}
    };

    public int minPathSum(int[][] grid) {
        flag = new boolean[grid.length][grid[0].length];
        flag[0][0] = true;
        dfs(0, 0, grid[0][0], grid);
        return min;
    }

    public void dfs(int x, int y, int dis, int[][] grid) {

        if (x == grid.length - 1 && y == grid[0].length -1) {
            if (dis < min) {
                min = dis;
            }
            return;   //第一处
        }

        for (int i = 0; i <= 1; i++) {
            int newx = x + coordinate[i][0];
            int newy = y + coordinate[i][1];  //第二处

            if (newx >= 0 && newx < grid.length && newy >= 0 && newy < grid[0].length && !flag[newx][newy]) {
                flag[newx][newy] = true;
                dfs(newx, newy, dis + grid[newx][newy], grid);
                flag[newx][newy] = false;
            }
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        int[][] grid = {
                {1, 3, 1}, {1, 5, 1}, {4, 2, 1}
        };
        System.out.println(m.minPathSum(grid));
    }
}
