package com.cola.数组.翻转图像;

/**
 * Author:cola
 * Date:2019/11/23
 * leetcode 48
 */
public class Main {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //先把每行变成每列
        /**
         * 1 4 7
         * 2 5 8
         * 3 6 9
         */
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        //镜像
        /**
         * 7 4 1
         * 8 5 2
         * 9 6 3
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new Main().rotate(matrix);
    }
}
