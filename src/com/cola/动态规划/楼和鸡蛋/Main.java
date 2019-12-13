package com.cola.动态规划.楼和鸡蛋;

/**
 * Author:cola
 * Date:2019/9/20
 * N层楼 M个鸡蛋  往下扔  最少几次能够判断出鸡蛋在最高层不被打破
 */
public class Main {
    public static void main(String[] args) {
        int maxFloor = solution(5,500 );
        System.out.println(maxFloor);
    }

    private static int solution(int eggNum, int floorNum) {
        if (eggNum < 1 || floorNum < 1) {
            return 0;
        }

        int[][] cache = new int[eggNum + 1][floorNum + 1];
        for (int i = 1; i <= eggNum; i++) {
            for (int j = 1; j <= floorNum; j++) {
                cache[i][j] = j; //每个值都初始化最大值
            }
        }

        for (int m = 2; m <= eggNum; m++) { //蛋
            for (int n = 1; n <= floorNum; n++) {//楼
                for (int o = 1; o < n; o++) {
                    cache[m][n] = Math.min(cache[m][n], 1 + Math.max(cache[m - 1][o - 1], cache[m][n - o]));
                }
            }
        }
        return cache[eggNum][floorNum];
    }


}
