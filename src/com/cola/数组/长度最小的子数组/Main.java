package com.cola.数组.长度最小的子数组;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 209
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println(solution(nums, s));
    }

    private static int solution(int[] nums, int s) {
        int l = 0;
        int r = -1;
        int sum = 0;
        int minResult = nums.length + 1;
        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {
                sum -= nums[l++];
            }
            if (sum >= s) {
                minResult = Math.min(minResult, r - l + 1);
            }
        }
        if (minResult == nums.length + 1) {
            return 0;
        }
        return minResult;
    }
}

