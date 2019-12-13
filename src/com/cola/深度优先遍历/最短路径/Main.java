package com.cola.深度优先遍历.最短路径;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/10
 */
public class Main {
    public static int n;
    public static int[][] arr = new int[100][100];
    public static int[] book = new int[100];
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MAX_VALUE;

    public static void dfs(int cur, int dis) {
        if (dis > min) {
            return;
        }

        if (cur == n) {
            if (dis < min) {
                min = dis;
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (arr[cur][i] != max && book[i] == 0) {
                book[i] = 1;
                dfs(i, dis + arr[cur][i]);
                book[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("输入n个城市");
        n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = max;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            book[i] = 0;
        }

        System.out.println("输入城市之间的道路");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= m; i++) {
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            int c = new Scanner(System.in).nextInt();
            arr[a][b] = c;
        }

        dfs(1, 0);

        System.out.println("最短路径为" + min);
    }
}
