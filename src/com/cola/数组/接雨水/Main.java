package com.cola.数组.接雨水;

/**
 * Author:cola
 * Date:2019/11/23
 * leetcode 42
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution(nums));
    }

    /**
     * 暴力解法
     *
     * @param height
     * @return
     */
    private static int solution(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int left_max = 0, right_max = 0;
            for (int j = i; j >= 0; j--) {
                left_max = Math.max(left_max, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                right_max = Math.max(right_max, height[j]);
            }
            res += Math.min(left_max, right_max) - height[i];
        }
        return res;
    }
}
