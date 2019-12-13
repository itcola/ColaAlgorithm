package com.cola.数组.两数之和;

import com.sun.org.apache.regexp.internal.RESyntaxException;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/11
 * leetcode 167
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution2(numbers, target);
        System.out.println(Arrays.toString(result));

    }

    /**
     * O（n）
     * @param numbers
     * @param target
     * @return
     */
    private static int[] solution2(int[] numbers, int target) {
        int[] arr = new int[2];
        int high = numbers.length - 1;
        int low = 0;

        while (low < high) {
            if (numbers[low] + numbers[high] > target) {
                high--;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                arr[0] = low + 1;
                arr[1] = high + 1;
                break;
            }
        }
        return arr;
    }


    /**
     * 时间复杂度 O(n^2)
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] solution(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    break;
                }
            }
        }
        return arr;
    }
}
