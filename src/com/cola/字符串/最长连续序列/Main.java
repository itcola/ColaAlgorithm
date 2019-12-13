package com.cola.字符串.最长连续序列;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/11/19
 * leetcode 128
 */
public class Main {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxLength = 1;
        int curLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    curLength += 1;
                } else {
                    maxLength = Math.max(curLength, maxLength);
                    curLength = 1;
                }
            }
        }

        return Math.max(curLength, maxLength);
    }


    public static void main(String[] args) {

    }


}
