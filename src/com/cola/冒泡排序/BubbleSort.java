package com.cola.冒泡排序;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int lastExchangeIndex = 0; //记录最后一次交换的位置
        int sortBorder = arr.length - 1; //无序数列的边界，每次比较到这里就可以

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < sortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false; //有元素进行交换
                    lastExchangeIndex = j; //最后交换的位置
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { 8,2,5,1,6,3,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
