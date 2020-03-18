package com.cola.数组.求相加的和;

import sun.print.SunMinMaxPage;

/**
 * Author:cola
 * Date:2019/12/24
 * 剑指offer 46
 * 不能用 if else for while  switch  case
 */
public class Main {
    public int Sum_Solution(int n) {

        return sum(n);
    }

    private int sum(int n) {
        try {
            int judge = 1 / n;
            return n + sum(n -1 );
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().Sum_Solution(5));
    }
}
