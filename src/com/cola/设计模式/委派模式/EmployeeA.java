package com.cola.设计模式.委派模式;

/**
 * Author:cola
 * Date:2020/2/20
 */
public class EmployeeA implements IEmplyee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，擅长前端，执行"+command);
    }
}
