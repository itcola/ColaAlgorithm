package com.cola.数组.杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 118
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> solution = solution(5);
    }

    private static List<List<Integer>> solution(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i-1) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

}
