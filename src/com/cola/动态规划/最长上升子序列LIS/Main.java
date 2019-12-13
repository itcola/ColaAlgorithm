package com.cola.动态规划.最长上升子序列LIS;

/**
 * Author:cola
 * Date:2019/10/1
 * leetcode 298
 */
public class Main {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int[] memo = new int[nums.length];
        for(int i = 0 ; i < memo.length ; i ++){
            memo[i] = 1;
        }
        for(int i = 1; i < nums.length; i ++){
            for(int j = 0 ; j < i; j++){
                if(nums[i] > nums[j]){
                    memo[i] = Math.max(memo[i],memo[j] + 1);
                }
            }
        }

        int max = 1; //因为这个数组中只要有一个数，那么他的最长上升子序列就为1
        for(int i = 0 ; i < memo.length; i++){
            max = Math.max(max,memo[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        int result = m.lengthOfLIS(nums);
        System.out.println(result);

    }
}
