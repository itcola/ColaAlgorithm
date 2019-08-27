package com.cola.插入排序;

import java.util.TreeMap;

public class InsertionSort {
    public void insertionSort(int[] arr){
        //第一次选择第一个数 就当他已经排序好
        //第二次选择第二个数 与第一个数进行比较 如果小于 则交换
        //第三次选择第三个数 先与第二个进行比较 如果大于 就进行下一个循环  如果小于 则交换第三个数与第二个数 再把第二个数与第一个数判断

        for(int i = 1; i < arr.length;  i ++){
            for (int j = i ; j > 0  ; j --){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {5,2,7,1,8,3};
        is.insertionSort(arr);
    }
}
