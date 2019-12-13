package com.cola.深度优先遍历;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/9
 * 把所有的牌放入所有的盒子，一个盒子只能放一张牌，共有多少种方法；
 */
public class 牌和盒子 {
    public static int n;

    public static int[] arr = new int[10]; //盒子
    public static int[] book = new int[10]; //牌

    public static void main(String[] args) throws InterruptedException {
        System.out.println("请输入一个数");
        n = new Scanner(System.in).nextInt();
        dfs(1);
    }

    public static void dfs(int step) {
        if (step == n + 1) {
            for(int i = 1; i <= n ; i ++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                arr[step] = i;
                book[i] = 1;
                dfs(step + 1);
                book[i] = 0;
            }
        }
    }


}
