package com.cola.字符串.左旋转字符串;

/**
 * Author:cola
 * Date:2019/11/25
 */
public class Main {
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0){
            return str;
        }
        String left = str.substring(0, n);
        String right = str.substring(n, str.length());
        return right+left;
    }
}
