package com.cola.数组.合并区间;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:cola
 * Date:2020/2/6
 */
public class Main {
    public static void main(String[] args) {
        int[][] arrs = {{1, 3}, {2, 6}, {7, 8}, {9, 10}};
        System.out.println(arrs[0][0]);

    }

    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < intervals[i].length; j++) {
                list.add(intervals[i][j]);
            }
            res.add(list);
        }
        List<List<Integer>> realRes = new ArrayList<>();
        while (!res.isEmpty()) {
            boolean flag = false;
            List<Integer> realList = new ArrayList<>();
            if (res.get(0).get(1) <= res.get(1).get(0)) {
                flag = true;
                realList.add(res.get(0).get(0));
                realList.add(res.get(1).get(1));
                res.remove(0);
                res.remove(1);
            }
            if (flag) {
                realRes.add(realList);
                res.add(0, realList);
            }

        }
        return null;
    }
}