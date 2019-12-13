package com.cola.动态规划.三角形最小路径和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/9/23
 */
public class Main {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l = new ArrayList<>();
        l.add(1);

        List<Integer> o = new ArrayList<>();
        o.add(2);
        o.add(3);

        List<Integer> r = new ArrayList<>();
        r.add(4);
        r.add(5);
        r.add(6);

        List<Integer> p = new ArrayList<>();
        p.add(8);
        p.add(7);
        p.add(9);
        p.add(10);

        list.add(l);
        list.add(o);
        list.add(r);
        list.add(p);


        int min = solution(list);
        System.out.println(min);
    }

    private static int solution(List<List<Integer>> triangle) {
        int[][] minDis = new int[triangle.size() + 1][triangle.size() + 1];
        System.out.println(Arrays.toString(minDis[3]));

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int  a = minDis[i+1][j];
                int b = minDis[i+1][j+1];
                minDis[i][j] = triangle.get(i).get(j) + Math.min(minDis[i + 1][j], minDis[i + 1][j + 1]);
                //minDis[i][j] = triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
            }
        }

        return minDis[0][0];

    }

}

