package com.cola.深度优先遍历;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/8
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rbCount = sc.nextInt();
        int[] rbArr = new int[rbCount];
        for (int i = 0; i < rbArr.length; i++) {
            rbArr[i] = sc.nextInt();
        }
        int[] resultArr = new int[rbArr.length];
        seeCount(rbArr, resultArr);
        int maxCount = resultArr[0];
        for (int i = 1; i < resultArr.length; i++) {
            if (resultArr[i] > maxCount) {
                maxCount = resultArr[i];
            }
        }
    }

    public static void seeCount(int[] rbArr, int[] resultArr) {
        for (int i = 0; i < rbArr.length; i++) {
            int curRb = rbArr[i];
            int count = 0;
            for (int j = i + 1; j < rbArr.length; j++) {
                if (rbArr[j] < curRb) {
                    count++;
                }
            }
            resultArr[i] = count;
        }
    }

}
