package com.cola.字典序;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/9/17
 *
 *
 */
public class Main {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 10; i++) {
             arr = solution(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[] solution(int[] arr) {
        //1.找到逆序区的前一个数
        int index = findReverseIndex(arr);
        if(index == 0){ //边界数字为0证明整个数组已经逆序，无法得到更大的数
            return null;
        }

        //2.复制一个数组的副本 避免直接修改入参
        int[] carr = Arrays.copyOf(arr, arr.length);

        //3.这个数与逆序区中**大于这个数的**最小的数进行交换
        exchangeNum(carr, index);

        //4.将原逆序区元素摆正
        reverseArr(carr, index);

        return carr;
    }


    private static int findReverseIndex(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return i;
            }
        }
        return 0;
    }


    private static void exchangeNum(int[] carr, int index) {
        int head = carr[index - 1];
        int minIndex = index;
        for (int i = index + 1; i < carr.length; i++) {
            if (carr[minIndex] > carr[i] && carr[i] > head) {//这个元素大于
                minIndex = i;
            }
        }
        carr[index - 1] = carr[minIndex];
        carr[minIndex] = head;
    }

    private static void reverseArr(int[] carr, int index) {
        for (int i = index, j = carr.length - 1; i < j; i++, j--) {
            int temp = carr[i];
            carr[i] = carr[j];
            carr[j] = temp;
        }
    }

}
