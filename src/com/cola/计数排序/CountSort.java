package com.cola.计数排序;

import java.util.Arrays;

public class CountSort {
    /**
     * 自己实现
     * @param arr
     * @param maxCount
     */
    /*public static void countSort(int[] arr,int maxCount){
        int[] initArr = new int[maxCount];
        for(int i = 0 ; i < maxCount ; i++){
            initArr[i] = 0;
        }
        for(int i = 0 ; i < arr.length; i++){
            initArr[arr[i]] ++ ;
        }
        for(int i = 0 ; i < maxCount; i++){
            while (initArr[i] > 0) {
                System.out.println(i+" ");
                initArr[i] --;
            }
        }
    }*/

    public static int[] countSort(int[] arr){
        //1.得到数组最大值
        int max = arr[0];
        for(int i = 1 ; i < arr.length; i ++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //2.根据最大值来确定统计数组的长度 且 各个索引的值初始都为0
        int[] countArray = new int[max+1];

        //3.遍历原数组，计数到统计数组
        for(int i = 0 ; i < arr.length ; i ++){
            countArray[arr[i]] ++;
        }

        //4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[arr.length];
        for(int i = 0 ; i < countArray.length ; i ++){
            for(int j = 0 ; j < countArray[i] ; j ++){
                sortedArray[index ++] = i;
            }
        }
        return sortedArray;
    }



    public static void main(String[] args) {
        int[] arr={2,6,0,8,6,9};
        int[] sortedArray = countSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

}
