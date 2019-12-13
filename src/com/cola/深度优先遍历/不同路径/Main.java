package com.cola.深度优先遍历.不同路径;

/**
 * Author:cola
 * Date:2019/11/8
 * leetcode 62
 */
public class Main {
    boolean[][] flag;
    int total = 0;

    int[][] coordinate = {
            {0, 1}, //向右走
            {1, 0} //向下走
    };

    public int uniquePaths(int m, int n) {
        flag = new boolean[m][n]; //初始化都为false
        flag[0][0] = true;
        dfs(0,0);
        return total;
    }

    public void dfs(int x, int y) {
        if (x == flag.length - 1 && y == flag[0].length - 1) {
            total++;
            return;
        }

        for (int i = 0; i < 2; i++) {
            int newx = x + coordinate[i][0];
            int newy = y + coordinate[i][1];

            if (newx >= 0 && newx < flag.length && newy >=0 && newy < flag[0].length && !flag[newx][newy]) {
                flag[newx][newy] = true;
                dfs(newx, newy);
                flag[newx][newy] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().uniquePaths(3, 2));
    }
}
