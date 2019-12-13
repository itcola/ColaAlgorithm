package com.cola.数组.买股票的最佳时机;

/**
 * Author:cola
 * Date:2019/10/21
 * leetcode 121
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        solution(prices);
    }

    //动态规划
    public static int solution3(int[] prices) {
        int maxProfile = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfile = Math.max(maxProfile,prices[i] - minPrice);
            minPrice = Math.min(prices[i],minPrice);
        }
        return maxProfile;
    }


    //暴力解法
    public static int solution(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
        }
        return max;
    }

    private static int solution2(int[] prices) {

        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int flag = prices.length - 1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = Math.min(min, prices[i]);
                flag = i;
            }
        }

        if (flag == prices.length - 1) {
            return max;
        } else {
            int resMax = 0;
            for (int i = flag; i < prices.length; i++) {
                resMax = Math.max(resMax, prices[i]);
            }
            return Math.max(max, resMax - min);
        }

    }


}
