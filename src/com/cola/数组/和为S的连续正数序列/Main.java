package com.cola.数组.和为S的连续正数序列;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Author:cola
 * Date:2019/11/25
 */
public class Main {
    /**
     * O(n)
     *
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence2(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1;
        int r = 2;
        int curSum = l + r;

        while (l < ((sum + 1) / 2)) {
            if (curSum == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                int cur = l;
                while (cur <= r) {
                    list.add(cur);
                    cur++;
                }
                res.add(list);
            }

            while (curSum > sum && l < ((sum + 1) / 2)) {
                curSum -= l;
                l++;
                if (curSum == sum) {
                    ArrayList<Integer> list = new ArrayList<>();
                    int cur = l;
                    while (cur <= r) {
                        list.add(cur);
                        cur++;
                    }
                    res.add(list);
                }
            }
            r++;
            curSum += r;
        }
        return res;
    }


    /**
     * O(n²)
     *
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 1; i < sum; i++) {
            int n = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i; j < sum; j++) {
                n += j;
                if (n == sum) {
                    int start = i;
                    int end = j;
                    while (start <= end) {
                        list.add(start);
                        start++;
                    }
                    res.add(list);
                    break;
                }
                if (n > sum) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new Main().FindContinuousSequence(2);
        for (ArrayList<Integer> arrayList : arrayLists) {
            System.out.println(arrayList);
        }
    }
}
