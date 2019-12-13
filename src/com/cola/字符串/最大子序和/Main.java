package com.cola.字符串.最大子序和;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 53
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution(arr));
    }

    /**
     * 动态规划
     * @param nums
     * @return
     */
    private static int solution(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if(sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            max = Math.max(max,sum);
        }
        return max;
    }


    /**
     * 暴力
     * @param nums
     * @return
     */
    private static int solution2(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max,nums[j]);
                sum += nums[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
