package com.cola.数组.缺失的第一个整数;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author:cola
 * Date:2019/11/23
 * leetcode 41
 */
public class Main {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int res = 0;
        boolean flag = true;
        for (int i = 1; i <= set.size(); i++) {
            if (!set.contains(i)) {
                res = i;
                flag = false;
                break;
            }
        }
        if (flag) {
            return nums[nums.length - 1] + 1;
        }
        return res;
    }
}
