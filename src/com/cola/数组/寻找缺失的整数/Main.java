package com.cola.数组.寻找缺失的整数;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/9/20
 * <p>
 * 整数范围1-100共有n个数，其他数出现偶数次，2个数出现奇数次（这个数出现了1次或3次或5次.....）  找到这两个奇数次的整数
 */

public class Main {
    public static void main(String[] args) {
        int[] result = new int[2];
        int[] arr = {4, 1, 2, 2, 5, 1, 3, 4};
        solution(arr, result);
        System.out.println(Arrays.toString(result));
    }

    private static void solution(int[] arr, int[] result) {

        int xorResult = 0;
        for (int i = 0; i < arr.length; i++) {
            xorResult ^= arr[i]; //这个结果为两个出现奇数次的数 异或 得到的值
        }
        if (xorResult == 0) { //如果这个数的值为0
            System.out.println("所有数字都出现了偶数次，没有出现奇数次的整数");
        }

        //找到这两个数 到数第几位不同
        int separator = 1;
        while ((separator & xorResult) == 0) {
            //进入此循环证明 倒数第一位 不相等
            separator <<= 1; //左移一位 2：0010  4：0100   8：1000
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & separator) == 0) {
                result[0] ^= arr[i];
            } else {
                result[1] ^= arr[i];
            }
        }
    }


}
