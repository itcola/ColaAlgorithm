package com.cola.深度优先遍历;

import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/10
 */
public class 解救 {
    int[][] arr = new int[51][51];
    int[][] book = new int[51][51];
    int length;
    int width;
    int p, q; //终点
    int min = 999; //步数


    public static void main(String[] args) {
        //step放哪合适
        解救 j = new 解救();

        j.initMap();//初始化迷宫

        int startx = 1;
        int starty = 1;

        j.dfs(startx, starty, 0);

        System.out.println(j.min);
    }


    public void dfs(int x, int y, int step) {

        int[][] next = {
                {0, 1}, //右
                {1, 0},//下
                {0, -1},//左
                {-1, 0}//上
        };

        //如果找到目标
        if (x == p && y == q) {
            if (min > step) {
                min = step;
            }
            return;
        }

        for (int i = 0; i <= 3; i++) {
            //下一步的坐标
            int tx = x + next[i][0];
            int ty = y + next[i][1];

            //如果越界
            if (tx < 1 || ty < 1 || tx > length || ty > width) {
                //return;
                continue;
            }

            //如果不是障碍物 且 在路上   (arr[tx][ty] == 0 能进入这个判断 证明此点不是障碍物)   （book[tx][ty] == 0 证明此点没走过)
            if (arr[tx][ty] == 0 && book[tx][ty] == 0) {
                book[tx][ty] = 1; //标记这个点已经走过
                dfs(tx, ty, step + 1);
                book[tx][ty] = 0;
            }

        }


    }

    public void initMap() {
        System.out.println("请输入终点");
        p = new Scanner(System.in).nextInt();
        q = new Scanner(System.in).nextInt();

        System.out.println("请输入长和宽:");
        length = new Scanner(System.in).nextInt();
        width = new Scanner(System.in).nextInt();

        System.out.println("初始化迷宫");
        //设置迷宫的长和宽 其中0为可以通过  1为障碍物
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

}
