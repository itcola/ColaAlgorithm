package com.cola.数组.合并两个有序数组;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/11
 * leetcode 88
 */
public class Main {
    public static void main(String[] args) {
        int m = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int n = 3;
        int[] nums2 = {2, 5, 6};
        solution(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void solution(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = 0, p2 = 0, p = 0;

        while (p1 < m && p2 < n) {
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
        }

        if (p1 < m) {
            System.arraycopy(nums1_copy, p1, nums1, p, m + n - p1 - p2);
        }
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p, m + n - p1 - p2);
        }
    }
}
