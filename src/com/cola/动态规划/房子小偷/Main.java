package com.cola.动态规划.房子小偷;

import javafx.scene.transform.Rotate;

/**
 * Author:cola
 * Date:2019/9/30
 */
public class Main {
    int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memo[i] = -1;
        }
        return solution3(nums);
    }

    //递归会有很多重叠子问题 造成时间超出
   /* private int solution(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int max = 0;
        for (int i = index; i < nums.length; i++) {
            max = Math.max(max, nums[i] + solution(nums, i + 2));
        }
        return max;
    }*/


    //记忆化搜索
   /* public int solution2(int[] nums, int index) {
        if(index >= nums.length){
            return 0;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        int max = 0;
        for (int i = index; i < nums.length; i++) {
            max = Math.max(max, nums[i] + solution2(nums, i + 2));
        }
        memo[index] = max;
        return max;
    }*/

    //动态规划
    public int solution3(int[] nums) {
        int n = nums.length;
        memo[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
            }
        }

        return memo[0];
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] nums = {2, 7, 9, 3, 10};
        System.out.println(m.rob(nums));
    }
}
