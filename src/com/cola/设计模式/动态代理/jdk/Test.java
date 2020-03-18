package com.cola.设计模式.动态代理.jdk;


/**
 * Author:cola
 * Date:2019/11/23
 */
public class Test {
    public static void main(String[] args) {
        PayProxy pp = new PayProxy();
        Payment pay = new Alipay();//这里也可以实现WechatPay
        Payment payment = (Payment) pp.getInstance(pay);
        payment.doPay("cola");
    }
}
