package com.cola.数组.反转字符串中的元音字母;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author:cola
 * Date:2019/10/11
 * leetcode 345
 */
public class Main {
    public static void main(String[] args) {
        String s = "hello";
        String result = solution2(s);
        System.out.println(result);
    }

    private static String solution2(String s) {
        char[] aeiou = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> set = new HashSet<>();
        for (char c : aeiou) {
            set.add(c);
        }
        char[] chars = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high && !set.contains(chars[low])) {
                low++;
            }
            while (low < high && !set.contains(chars[high])) {
                high--;
            }

            if(low < high){
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
            }
            low ++;
            high --;
        }
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return String.valueOf(sb);
    }


    private static String solution(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high && s.charAt(low) != 'a' && s.charAt(low) != 'e' && s.charAt(low) != 'i' && s.charAt(low) != 'o' && s.charAt(low) != 'u' && s.charAt(low) != 'A' && s.charAt(low) != 'E' && s.charAt(low) != 'I' && s.charAt(low) != 'O' && s.charAt(low) != 'U') {
                low++;
            }
            while (low < high && s.charAt(high) != 'a' && s.charAt(high) != 'e' && s.charAt(high) != 'i' && s.charAt(high) != 'o' && s.charAt(high) != 'u' && s.charAt(high) != 'A' && s.charAt(high) != 'E' && s.charAt(high) != 'I' && s.charAt(high) != 'O' && s.charAt(high) != 'U') {
                high--;
            }
            if (low < high) {
                char[] chars = s.toCharArray();
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                StringBuilder sb = new StringBuilder();
                for (char aChar : chars) {
                    sb.append(aChar);
                }
                s = String.valueOf(sb);
                low++;
                high--;
            }
        }
        return s;
    }
}
