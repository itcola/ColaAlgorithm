package com.cola.设计模式.动态代理.jdk;

/**
 * Author:cola
 * Date:2019/11/23
 */
public class Alipay implements Payment {
    @Override
    public void doPay(String name) {
        System.out.println(name+"进行了支付宝支付");
    }
}
