package com.cola.查找表.存在重复元素2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author:cola
 * Date:2019/10/13
 * leetcode 219
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(solution(nums, k));
    }

    private static boolean solution(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static boolean solution2(int[] nums, int k) {
        for(int i = 0 ; i < nums.length - 1 ; i ++){
            for(int j = i + 1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    if(Math.abs(i-j) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
