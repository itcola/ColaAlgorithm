package com.cola.动态规划.斐波纳妾数列;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/20
 */
public class Main {
    public static int n;
    public static int[] memo; //不能在这里初始化

    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();

        memo = new int[n + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        System.out.println("递归" + solution1(n));
        System.out.println("记忆化搜索" + solution2(n));
        System.out.println("动态规划" + solution3(n));
    }

    /**
     * 递归解法
     *
     * @param n
     * @return
     */
    private static int solution1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return solution1(n - 1) + solution1(n - 2);
    }


    /**
     * 记忆化搜索
     *
     * @param n
     * @return
     */
    private static int solution2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] == -1) {
            memo[n] = solution2(n - 1) + solution2(n - 2);
        }
        return memo[n];
    }

    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    private static int solution3(int n) {
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }


}
