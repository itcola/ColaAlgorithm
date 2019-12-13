package com.cola.排序.插入排序;

import java.util.Arrays;

/**
 * 插入排序
 * 首先先将数组中的第一个数默认为有序数
 * 将第二个数设为要插入的数
 * 将要插入的数和有序数中的数从后向前依次比较 进行交换
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i]; //待插入的数
            int j = i - 1; //有序数中最后一个元素（也就是待插入元素的前一个数）
            for (; j >= 0 && insertValue < arr[j]; j--) {
                arr[j + 1] = arr[j]; //不用每次都两两交换
            }
            arr[j + 1] = insertValue; //最后把要插入的值放在指定的位置
        }

    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 1, 8, 3};
        //insertionSort(arr);
        insertSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //自己实现
    public static void insertSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            for (; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
