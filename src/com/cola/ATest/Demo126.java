package com.cola.ATest;

import java.nio.charset.Charset;

/**
 * Author:cola
 * Date:2020/1/26
 */
public class Demo126 {
    public static void main(String[] args) {
        String s = "a";
        String str = "中国";
        System.out.println(Charset.defaultCharset());
        System.out.println(str.getBytes().length);
        System.out.println(s.getBytes().length);
    }
}
