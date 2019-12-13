package com.cola.查找表.两个数组的交集1;

import java.util.*;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 349
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,1};
        int[] arr2 = {2,2,1};
        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    private static int[] solution(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i ++){
            set.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length; i ++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size(); i ++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
