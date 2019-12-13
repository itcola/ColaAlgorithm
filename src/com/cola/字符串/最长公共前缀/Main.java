package com.cola.字符串.最长公共前缀;

import org.junit.Test;

/**
 * Author:cola
 * Date:2019/10/19
 * leetcode 14
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(solution(strs));
    }

    private static String solution(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }

    private static String solution2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int[] arr = new int[256];
        StringBuilder sb = new StringBuilder();

        for (char c : strs[0].toCharArray()) {
            arr[c]++;
            sb.append(c);
        }

        for (int i = 1; i < strs.length; i++) {
            sb = new StringBuilder();
            for (char c : strs[i].toCharArray()) {
                if (arr[c] == 0) {
                    break;
                }
                if (arr[c] == i) {
                    arr[c]++;
                    sb.append(c);
                } else {
                    break;
                }
            }
        }
        return sb.toString();
    }

    @Test
    public void run() {
        System.out.println("xslett".indexOf("le"));
    }
}
