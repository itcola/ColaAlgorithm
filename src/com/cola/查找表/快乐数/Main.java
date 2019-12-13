package com.cola.查找表.快乐数;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 202
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    static int bitSquareSum(int n) {
        int sum = 0;
        while(n > 0)
        {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        int slow = n, fast = bitSquareSum(n);
        while(slow != fast)
        {
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        }
        return slow == 1;
    }

}
