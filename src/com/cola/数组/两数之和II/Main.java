package com.cola.数组.两数之和II;

import java.util.ArrayList;

/**
 * Author:cola
 * Date:2019/11/25
 * 递增数组。和为target的两个数，且两个数的乘积最小
 */
public class Main {
    /**
     * O(n)
     *
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length < 2) {
            return list;
        }
        int l = 0;
        int r = array.length - 1;
        int min = Integer.MAX_VALUE;
        int x = -1;
        int y = -1;
        while (l < r) {
            if (array[l] + array[r] > sum) {
                r--;
            } else if (array[l] + array[r] < sum) {
                l++;
            } else {
                int res = array[l] * array[r];
                if (res < min) {
                    x = l;
                    y = r;
                    min = res;
                }
                l++;
                r--;
            }
        }
        if (x == -1 && y == -1) {
            return new ArrayList<Integer>();
        }
        list.add(array[x]);
        list.add(array[y]);
        return list;
    }

    /**
     * O(n²)
     *
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum2(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) {
            return res;
        }
        int min = Integer.MAX_VALUE;
        int x = -1;
        int y = -1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    if (array[i] * array[j] < min) {
                        x = i;
                        y = j;
                        min = array[i] * array[j];
                    }
                }
            }
        }
        if (x == -1 && y == -1) {
            return new ArrayList<Integer>();
        }
        res.add(array[x]);
        res.add(array[y]);
        return res;
    }

}
