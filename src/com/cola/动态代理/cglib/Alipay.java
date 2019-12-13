package com.cola.动态代理.cglib;

import com.cola.动态代理.jdk.Payment;

/**
 * Author:cola
 * Date:2019/11/23
 */
public class Alipay {

    public void doPay(String name) {
        System.out.println(name+"进行了支付宝支付");
    }
}
