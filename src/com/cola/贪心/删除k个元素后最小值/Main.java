package com.cola.贪心.删除k个元素后最小值;

/**
 * Author:cola
 * Date:2019/9/17
 */

import com.sun.xml.internal.fastinfoset.util.CharArrayArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心：局部最优的解，得到全局最优的解
 * <p>
 * 题目:例如 541270936 删除3个数 使数字的值最小
 * 思路:从左到右删除某一个大于右边的数
 * 分三次删除  一次删除一个数 使每次删除一个数后的值都最小
 * <p>
 * 注：substring [ ) 左闭右开
 * string.length(); arr.length ; list.size();
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(solution("541270936", 3));
        System.out.println(solution("1002", 2));
    }

    private static String solution(String num, int k) {
        //删除k次
        for (int i = 0; i < k; i++) {
            boolean flag = false;
            for (int j = 0; j < num.length() - 1; j++) {
                if (num.charAt(j) > num.charAt(j + 1)) { //如果有一个数比右边的大 则删除这个数
                    num = num.substring(0, j) + num.substring(j + 1, num.length());
                    flag = true;
                    break;
                }
            }

            //如果没有找到要删除的数字（证明左边的数都比右边的小）,删除最后一个数
            if (!flag) {
                num = num.substring(0, num.length() - 1);
            }

            //如果删除后的num左边有零 需将零清空
            num = clearZero(num);
        }

        //如果删除后长度为0
        if (num.length() == 0) {
            return "0";
        }
        return num;
    }

    private static String clearZero(String num) {
        for (int i = 0; i < num.length()-1; i++) {
            if (num.charAt(0) != '0') {
                break;
            }
            num = num.substring(1, num.length());
        }
        return num;
    }



}
