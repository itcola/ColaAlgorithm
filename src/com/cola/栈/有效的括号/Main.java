package com.cola.栈.有效的括号;

import java.util.Stack;

/**
 * Author:cola
 * Date:2019/10/15
 * leetcode 20
 */
public class Main {
    public static void main(String[] args) {

    }

    public static boolean solution(String s) {
            Stack stack = new Stack();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if(stack.size() == 0){
                        return false;
                    }
                    char match;
                    if (c == ')') {
                        match = '(';
                    } else if (c == '}') {
                        match = '{';
                    } else {
                        match = '[';
                    }

                    if(!stack.pop().equals(match)){
                        return false;
                    }
                }
            }

            if(stack.size() != 0){
                return false;
            }
            return true;
    }
}
