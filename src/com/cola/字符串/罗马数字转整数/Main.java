package com.cola.字符串.罗马数字转整数;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2019/10/19
 * leetcode 13
 */
public class Main {
    public static void main(String[] args) {
        solution("MCMXCIV");
    }

    private static int solution(String s) {
        Map<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int sum = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i > 0; i--) {
            if (map.containsKey(s.substring(i - 1, i + 1))) {
                sum += map.get(s.substring(i - 1, i + 1));
                i--;
                if (i - 1 == 0) {
                    flag = true;
                }
            } else {
                sum += map.get(s.substring(i, i + 1));
            }
        }
        if (!flag) {
            sum += map.get(s.substring(0, 1));
        }
        return sum;
    }


}
