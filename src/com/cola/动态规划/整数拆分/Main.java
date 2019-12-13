package com.cola.动态规划.整数拆分;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/29
 * leetcode 343
 */
public class Main {
    int[] memo;

    private int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int integerBreak(int n) {
        memo = new int[n + 1];
        //int max1 = solution1(n);
        //int max2 = solution2(n);
        int max3 = solution3(n);
        return max3;
    }

    // 递归 执行时间太长，存在很多重叠子问题
    /*
    public int solution1(int n) {
        if (n == 1) {
            return 1;
        }
        int max = -1;
        for (int i = 1; i < n; i++) {
            max = max3(max, i * (n - i), i * solution1(n - i));
        }
        return max;
    }*/

    //记忆化搜索  也超出时间限制
   /* public int solution2(int n) {
        if (n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        int max = -1;
        for (int i = 1; i < n; i++) {
            max = max3(max, i * (n - i), i * solution2(n - i));
        }
        memo[n] = max;
        return max;
    }*/

    //动态规划
    public int solution3(int n) {
        memo[1] = 1;
        for (int i = 2; i <= n; i++) { // <=n 是因为n也需要被分割
            for (int j = 1; j <= i - 1; j++) { //每次都是从1开始，分割到i-1 ； 例如上边 i = 4 ,那么这层需要分割到从1到3
                memo[i] = max3(memo[i], j * (i - j), j * memo[i - j]); //i-j 一定小于i，所以求memo[i]时memo[i-j]已经有值
            }
        }
        return memo[n];
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = m.integerBreak(num);
        System.out.println(max);
    }
}
