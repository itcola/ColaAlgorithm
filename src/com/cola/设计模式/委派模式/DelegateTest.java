package com.cola.设计模式.委派模式;

/**
 * Author:cola
 * Date:2020/2/20
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("架构",new Leader());
    }
}
