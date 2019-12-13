package com.cola.回溯.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/9/28
 */
public class Main {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    int[] book;

    public List<List<Integer>> combine(int n, int k) {
        solution(n, k, 0, 1);
        return result;
    }

    public void solution(int n, int k, int step, int start) {
        if (step == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            solution(n,k,step + 1, i + 1);
            list.remove(step);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.combine(4, 2);
        for (List<Integer> integers : m.result) {
            System.out.println(integers.toString());
        }
    }
}

