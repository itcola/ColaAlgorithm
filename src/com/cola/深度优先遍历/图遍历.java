package com.cola.深度优先遍历;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/10
 */
public class 图遍历 {
    public static int n;
    public static int[][] e = new int[100][100];
    public static int[] book =new int[100];
    public static int sum = 0;


    public static void dfs(int cur) {
        System.out.println(cur);
        sum ++;
        //终止条件
        if( sum == n){
            return;
        }

        for( int i = 1; i <= n; i++){
            if (e[cur][i] == 1 && book[i] ==0) {
                book[i] = 1;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入顶点个数和边数");
         n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();

        //初始化二维数组
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    e[i][j] = 0; //两个顶点为同一个数 所以无边
                } else {
                    e[i][j] = 99999;// 代表正无穷 也就是两个顶点之间没有边
                }
            }
        }
        //初始化标记数组
        for (int i = 1; i <= n; i++) {
            book[i] = 0;
        }

        System.out.println("请输入有边的两个顶点");
        for (int i = 0; i < m; i++) {
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            e[a][b] = 1;
            e[b][a] = 1;
        }

        book[1] = 1;
        dfs(1);

    }

}
