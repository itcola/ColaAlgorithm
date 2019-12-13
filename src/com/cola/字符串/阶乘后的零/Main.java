package com.cola.字符串.阶乘后的零;

/**
 * Author:cola
 * Date:2019/11/7
 * leetcode 172
 */
public class Main {
    public int trailingZeroes(int n) {
        int res = 0;
        int sum = caculate(n);
        String str = String.valueOf(sum);
        StringBuilder sb = new StringBuilder();
        str = sb.append(str).reverse().toString();
        while(str.startsWith("0")){
            res ++ ;
            str = str.substring(1,str.length());
        }
        return res;
    }

    public int caculate(int n){
        if(n == 1){
            return 1;
        }
        return n * caculate(n-1);
    }
}
