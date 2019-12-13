package com.cola.数组.无重复的最长字串;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 3
 */
public class Main {
    public static void main(String[] args) {
        String s = "cocacola";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = -1;
        int result = 0;
        int[] freq = new int[256];

        while (l < chars.length) {
            if (r + 1 < chars.length && freq[chars[r + 1]] == 0) {
                freq[chars[++r]]++;
            } else {
                freq[chars[l++]]--;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
