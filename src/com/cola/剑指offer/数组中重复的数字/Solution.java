package com.cola.剑指offer.数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:cola
 * Date:2020/2/27
 */
public class Solution {
    private Set<Integer> set = new HashSet<>();

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }
}
