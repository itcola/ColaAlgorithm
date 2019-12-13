package com.cola.排序.冒泡排序;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class BubbleSort {

    /**
     * 普通冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 优化版冒泡
     *
     * @param arr
     */
    public static void bubbleSortType2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            //在某轮没有元素进行交换，证明整个数组已经有序，直接跳出整个循环结束。
            if (isSorted) {
                break;
            }
        }
    }

    /**
     * 最优冒泡排序
     *
     * @param arr
     */
    public static void bubbleSortType3(int[] arr) {
        int lastChangeIndex = 0;//记录最后一个交换的位置
        int isSortedBorder = arr.length - 1;//无序数列的边界，每次只需比较交换到这里

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < isSortedBorder; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    lastChangeIndex = j;
                }
            }
            isSortedBorder = lastChangeIndex;
            if (isSorted) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,0,2,1,0,1};
        int[] arr2 = {8, 2, 5, 1, 6, 3, 9};
        int[] arr3 = {8, 2, 5, 1, 6, 3, 9};
        bubbleSort(arr);
        bubbleSortType2(arr2);
        bubbleSortType3(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

}
