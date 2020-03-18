package com.cola.设计模式.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:cola
 * Date:2019/11/23
 */
public class PayProxy implements InvocationHandler {

    Object target;

    public Object getInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理");
        Object res = method.invoke(target, args);
        System.out.println("后置处理");
        return res;
    }
}
