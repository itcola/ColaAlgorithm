package com.cola.字符串.最长回文字串;

/**
 * Author:cola
 * Date:2019/11/8
 * leetcode 5
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().longestPalindrome(""));
    }

    public String longestPalindrome(String s) {
        if (s == null || s == "") return "";
        int maxLength = 0;
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                StringBuilder sb = new StringBuilder();
                String str = s.substring(i, j);
                String reverseStr = sb.append(str).reverse().toString();
                if (str.equals(reverseStr) && str.length() > maxLength) {
                    maxLength = Math.max(maxLength, str.length());
                    res = str;
                }
            }
        }
        return res;
    }
}
