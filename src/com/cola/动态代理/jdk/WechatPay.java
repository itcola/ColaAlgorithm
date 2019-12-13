package com.cola.动态代理.jdk;

/**
 * Author:cola
 * Date:2019/11/24
 */
public class WechatPay implements Payment {
    @Override
    public void doPay(String name) {
        System.out.println(name + "进行了支付宝支付");
    }
}
