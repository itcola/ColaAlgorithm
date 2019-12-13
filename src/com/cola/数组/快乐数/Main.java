package com.cola.数组.快乐数;

/**
 * Author:cola
 * Date:2019/11/7
 * leetcode 202
 */
public class Main {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = solution(slow);
            fast = solution(fast);
            fast = solution(fast);
        }while( fast != slow);

        return slow == 1;
    }

    public int solution(int n){
        int sum = 0;

        while(n > 0){
            int b = n % 10;
            sum += b * b;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Main().isHappy(20));
    }
}
