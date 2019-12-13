package com.cola.数组.数字在排序数组中出现的次数;

/**
 * Author:cola
 * Date:2019/11/24
 * offer 38
 */
public class Main {

    public int solution(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > k) {
                right = mid - 1;
            } else if (nums[mid] < k) {
                left = mid + 1;
            } else {
                if (nums[mid - 1] != k) {
                    while (nums[mid] == k) {
                        res++;
                        mid++;
                    }
                    break;
                } else {
                    int temp = mid - 1;
                    while (nums[mid] == k) {
                        res++;
                        mid++;
                    }
                    while (nums[temp] == k) {
                        res++;
                        temp--;
                    }
                    break;
                }
            }
        }
        return res;

    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 4, 4, 4, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(new Main().solution(nums, 3));
    }

}
