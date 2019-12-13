package com.cola.字符串.括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/11/19
 * leetcode 22
 */
public class Main {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        allConstruct(new char[2 * n], 0);
        return res;
    }

    private void allConstruct(char[] chars, int index) {
        if (index == chars.length) {
            if (valid(chars)) {
                res.add(new String(chars));
            }
        } else {
            chars[index] = '(';
            allConstruct(chars, index + 1);
            chars[index] = ')';
            allConstruct(chars, index + 1);
        }
    }

    private boolean valid(char[] chars) {
        int balance = 0;

        for (char c : chars) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }


    public static void main(String[] args) {
        System.out.println(new Main().generateParenthesis(0).toString());
    }
}
