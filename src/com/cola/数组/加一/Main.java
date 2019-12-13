package com.cola.数组.加一;

import java.util.Iterator;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 66
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {9};
        solution(nums);
    }

    private static int[] solution(int[] digits) {
        int[] nums = new int[digits.length + 1];
        int[] res = new int[digits.length + 1];

        for (int i = 0; i < digits.length; i++) {
            nums[i] = digits[digits.length - 1 - i];
        }

        for (int i = 0; i < res.length; i++) {
            if (i == 0) {
                int n = nums[i] + 1;
                if (n > 9) {
                    res[i] = n - 10;
                    res[i + 1] = 1;
                }else{
                    res[i] = n;
                }
            } else {
                if (nums[i] + res[i] > 9) {
                    res[i] = nums[i] + res[i] - 10;
                    res[i + 1] = 1;
                } else {
                    res[i] = nums[i] +res[i];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i]);
        }

        String str = sb.toString();
        if (str.startsWith("0")) {
            str = str.substring(1, str.length());
        }

        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }
        return res;
    }
}
