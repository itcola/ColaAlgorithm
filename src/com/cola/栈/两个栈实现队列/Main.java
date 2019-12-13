package com.cola.栈.两个栈实现队列;

import java.util.Stack;

/**
 * Author:cola
 * Date:2019/9/17
 */
public class Main {

    public static Stack<Integer> inStack = new Stack<>(); //入队用
    public static Stack<Integer> outStack = new Stack<>(); //出队用

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());
    }

    //入队
    public static void push(int element) {
        inStack.push(element);
    }

    public static Integer pop(){
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return null;
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        Integer popValue = outStack.pop();
        return popValue;
    }

}
