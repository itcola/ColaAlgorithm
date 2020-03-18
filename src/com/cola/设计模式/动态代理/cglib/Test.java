package com.cola.设计模式.动态代理.cglib;

/**
 * Author:cola
 * Date:2019/11/24
 */
public class Test {
    public static void main(String[] args) {
        PayProxy cglib = new PayProxy();
        Alipay alipay = new Alipay();
        Alipay ali = (Alipay) cglib.getInstance(alipay);
        ali.doPay("cola");
    }
}
