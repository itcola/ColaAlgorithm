package com.cola.数组.移动零;

import org.junit.Test;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/10
 * leetcode 283 移动零         26 27 80
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 4};
        //solution(arr);
        System.out.println(Arrays.toString(arr));

        //solution2(arr);
        System.out.println(Arrays.toString(arr));

        solution3(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solution3(int[] arr) {
        int j = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                for (; i < j - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[--j] = 0;
            }
        }
    }

    private static void solution2(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
    }

    /**
     * 时间复杂度 O（n）
     * 空间复杂度 O（1）
     *
     * @param arr
     */
    private static void solution(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

}



