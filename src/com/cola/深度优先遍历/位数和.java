package com.cola.深度优先遍历;

/**
 * Author:cola
 * Date:2019/9/9
 */
public class 位数和 {
    public int n = 9;
   // public int total = 0;
    public int[] arr = new int[10];
    public int[] book = new int[10];

    public static void main(String[] args) {

        位数和 w = new 位数和();
        w.initArr();
        w.dfs(1);

    }

    public void initArr() {

        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
            book[i] = 0;
        }
    }

    public void dfs(int step) {

        if (step == n + 1) {
            //结束条件
            if (arr[1] * 100 + arr[2] * 10 + arr[3] + arr[4] * 100 + arr[5] * 10 + arr[6] == arr[7] * 100 + arr[8] * 10 + arr[9]) {
              //  total++;
                System.out.println(""+arr[1] + arr[2] + arr[3] + "+" + arr[4] + arr[5] + arr[6] + "=" + arr[7] + arr[8] + arr[9]);
            }
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
