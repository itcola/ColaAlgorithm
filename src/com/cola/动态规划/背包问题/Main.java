package com.cola.动态规划.背包问题;

/**
 * Author:cola
 * Date:2019/10/1
 */
public class Main {

    //动态规划 分为一个二位数组 行是商品  列是背包容量
    private int solution(int[] weight, int[] value, int c, int[][] memo) {
        int n = weight.length;

        for (int i = 0; i < c + 1; i++) {
            memo[0][i] = i >= weight[0] ? value[0] : 0; //只考虑第一个物品
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < c + 1; j++) {
                memo[i][j] = memo[i - 1][j];
                if (j >= weight[i]) {
                    memo[i][j] = Math.max(memo[i][j], value[i] + memo[i - 1][j - weight[i]]);
                }
            }
        }
        return memo[n - 1][c];
    }


    //递归
    private int solution2(int[] weight, int[] value, int c, int index) {
        if (index < 0 || c <= 0) {
            return 0;
        }

        int max = solution2(weight, value, c, index - 1);
        if (c >= weight[index]) {
            max = Math.max(max, value[index] + solution2(weight, value, c - weight[index], index - 1));
        }
        return max;
    }


    public static void main(String[] args) {
        Main m = new Main();
        int[] weight = {1, 2, 3};
        int[] value = {6, 10, 12};
        int c = 5;
        int[][] memo = new int[weight.length][c + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
        //解法一 动态规划
        //int result = m.solution(weight, value, c, memo);
        //System.out.println(result);

        //解法二 递归
        //int result2 = m.solution2(weight, value, c, 2);
        //System.out.println(result2);

        //解法三 动态规划 优化了空间 只使用一行
        int[] memory = new int[c + 1];

        m.solution3(weight, value, c, memory);
    }

    //优化版 动态规划
    private void solution3(int[] weight, int[] value, int c, int[] memory) {
        for (int i = 0; i < c + 1; i++) {
            memory[i] = memory[i] > 0 ? value[0] : 0;
        }

        for (int i = c; i >= 0; i--) {
            if (i >= memory[i]) {
                memory[i] = Math.max(memory[i], memory[i] + memory[i - weight[i]]);
            }
        }
         //待完成！！！！！！！！！！！！！！！！！！！
         //待完成！！！！！！！！！！！！！！！！！！！
         //待完成！！！！！！！！！！！！！！！！！！！
         //待完成！！！！！！！！！！！！！！！！！！！
         //待完成！！！！！！！！！！！！！！！！！！！
         //待完成！！！！！！！！！！！！！！！！！！！
    }


}
