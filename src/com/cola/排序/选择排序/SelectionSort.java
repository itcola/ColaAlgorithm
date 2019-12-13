package com.cola.排序.选择排序;

import java.util.Arrays;

/**
 * 选择排序
 * 选定数组中第一个元素为最小元素
 * 依次和第二个到最后一个元素作比较，比首元素更小的值与其交换
 * 第二轮认定第二个元素为最小元素， 依次和第三个到最后一个元素作比较进行交换
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                //得到最小值
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 6, 1, 7, 4};
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

}
