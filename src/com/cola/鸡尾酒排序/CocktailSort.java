package com.cola.鸡尾酒排序;

import com.sun.corba.se.internal.Interceptors.PIORB;

import java.util.Arrays;

public class CocktailSort {
    public static void cocktailSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {

            boolean isSorted = true;
            for (int m = 0; m < arr.length - i - 1; m++) {
                if (arr[m] > arr[m + 1]) {
                    int temp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }


            isSorted = true;
            for (int n = arr.length - i - 1; n > i; n--) {
                if (arr[n] < arr[n - 1]) {
                    int temp = arr[n];
                    arr[n] = arr[n - 1];
                    arr[n - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7, 6};
        cocktailSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
