package com.cola.回溯.单词搜索;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/9/29
 * leetcode 79
 * true 一层层返回  false 继续遍历
 */
public class Main {
    int m, n; //二维数组board的长和宽
    boolean[][] mark; // 标记数组 这样在某个方法中进行new boolean[m][n]就会有默认值false
    int[][] coordinate = {
            {-1, 0}, //上
            {0, 1}, //右
            {1, 0}, //下
            {0, -1} //左
    };

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        mark = new boolean[m][n]; // 默认都为false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int startx, int starty, int index) {
        //每次进入循环先判断当前的borad[startx,starty]的值是否为word[index]的值
       /* if (board[startx][starty] != word.charAt(index)) {
            return false;
        }*/

        if (index == word.length() - 1) {
            return board[startx][starty] == word.charAt(index);
        }

        if (board[startx][starty] == word.charAt(index)) {
            mark[startx][starty] = true;
            for (int i = 0; i < 4; i++) {
                //顺序为上 右 下 左四个方向
                int newx = startx + coordinate[i][0];
                int newy = starty + coordinate[i][1];

                if (newx >= 0 && newx < m && newy >= 0 && newy < n && !mark[newx][newy]) {
                    if (search(board, word, newx, newy, index + 1)) {
                        return true;
                    }
                }
            }
            mark[startx][starty] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        Main m = new Main();

        char[][] board = {
                {'a','b'}
        };
        String word = "ba";

        boolean exist = m.exist(board, word);
        System.out.println(exist);

    }
}