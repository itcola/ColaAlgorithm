package com.cola.查找表.两个数组的交集2;

import java.util.*;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 350
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    private static int[] solution(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        for (Integer i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
