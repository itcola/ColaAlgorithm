package com.cola.栈.最小栈;

import java.util.Stack;

/**
 * Author:cola
 * Date:2019/9/7
 */
public class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /**
     * 1.判断主栈是否为空（主栈为空辅栈肯定为空）
     * 2.返回辅栈栈顶元素
     * @return
     * @throws Exception
     */
    public Integer getMin() throws Exception {
        if (mainStack.empty()) {
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }

    /**
     * 1.判断主栈是否为空
     * 2.判断主栈出栈元素是否与辅栈栈顶元素相等
     *   相等 辅栈栈顶元素都出栈
     * 3.主栈栈顶元素出栈
     * @return
     * @throws Exception
     */
    public Integer pop() throws Exception {
        if (mainStack.empty()) {
            throw new Exception("stack is empty");
        }
        if (mainStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        return mainStack.pop();

    }

    /**
     * 1.元素入主栈
     * 2.判断辅栈是否为空 || 元素小于等于辅栈栈顶元素。 元素入辅栈
     * @param value
     */
    public void push(Integer value) {
        mainStack.push(value);
        if (minStack.empty() || minStack.peek() >= value) {
            minStack.push(value);
        }

    }

    public static void main(String[] args) throws Exception {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(2);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }

}
