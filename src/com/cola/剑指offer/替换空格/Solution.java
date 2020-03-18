package com.cola.剑指offer.替换空格;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:cola
 * Date:2020/3/1
 */
public class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] chars = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            } else {
                chars[size++] = c;
            }
        }
        String str = String.valueOf(chars, 0, size);
        return str;
    }
}
