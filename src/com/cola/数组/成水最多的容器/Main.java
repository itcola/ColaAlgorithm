package com.cola.数组.成水最多的容器;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 11
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(nums));
    }

    private static int solution(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    /**
     * 暴力解法
     *
     * @param height
     * @return
     */
    private static int solution1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i+1; j < height.length; j++) {
                maxArea = Math.max(maxArea,Math.min(height[i],height[j]) * (j-i));
            }
        }
        return maxArea;
    }
}
