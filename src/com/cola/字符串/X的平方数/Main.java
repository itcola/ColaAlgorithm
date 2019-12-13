package com.cola.字符串.X的平方数;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 69
 */
public class Main {
    public static void main(String[] args) {
        solution(17);
    }

    private static int solution(int x) {
        if (x == 0) {
            return 0;
        }
        int i;
        for (i = 0; i < x; i++) {
            if (x >= i * i && x < (i + 1) * (i + 1)) {
                break;
            }
        }
        return i;
    }
}
