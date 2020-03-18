package com.cola.队列.两个队列实现栈;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author:cola
 * Date:2020/3/1
 * leetcode 225
 */
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        Queue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q2.poll();
    }

    /** Get the top element. */
    public int top() {
        return q2.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
