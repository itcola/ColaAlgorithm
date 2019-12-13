package com.cola.数组.颜色分类;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/11
 * leetcode 75
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 1, 0};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void solution(int[] nums) {
        //这两个初始化都是为了让刚开始的前后两个区间没有元素
        int zero = -1; //  [zero,0]
        int two = nums.length; // [two,nums.length-1]

        for (int i = 0; i < two;) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two --;
                int temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
            }else{
                zero ++;
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                i ++;
            }
        }

    }
}
