package com.cola.数组.寻找数组中第K大元素;

import java.util.PriorityQueue;

/**
 * Author:cola
 * Date:2019/10/11
 * leetcode 215
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 1, 4, 6};
        int k = 2;
        int result = solution(nums, k);
        System.out.println(result);
    }

    private static int solution(int[] nums, int k) {
        PriorityQueue pq = new PriorityQueue();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return (int) pq.poll();
    }
}
