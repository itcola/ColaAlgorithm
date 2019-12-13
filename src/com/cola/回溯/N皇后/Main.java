package com.cola.回溯.N皇后;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/9/29
 * leetcode 51
 */
public class Main {
    List<List<String>> result = new ArrayList<>();
    boolean[] col;
    boolean[] dia1;
    boolean[] dia2;

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        List<Integer> list = new ArrayList<>();
        solution(n, 0, list);
        return result;
    }

    public void solution(int n, int index, List<Integer> list) {
        if (index == n) {
            result.add(IntegerToString(new ArrayList<>(list), n));
            return;
        }

        // i 是列  index 是行  每次solution都是进入新得一行 只需要判断 列 对角线
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]) {
                list.add(i);
                col[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n - 1] = true;
                solution(n, index + 1, list);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                list.remove(index);
            }
        }

    }

    private List<String> IntegerToString(List<Integer> list, int n) {
        List<String> strList = new ArrayList<>(); // 返回结果
        for (Integer k : list) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i == k) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            strList.add(sb.toString());
        }
        return strList;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int n = 4;
        m.solveNQueens(n);
        for (List<String> strings : m.result) {
            System.out.println(strings.toString());
        }
    }

}
