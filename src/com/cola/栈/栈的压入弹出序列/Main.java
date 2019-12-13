package com.cola.栈.栈的压入弹出序列;

import java.util.Stack;

/**
 * Author:cola
 * Date:2019/10/9
 * 第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class Main {


    public static void main(String[] args) {
        int[] pushArr = {1, 2, 3, 4, 5};
        int[] popArrA = {4, 5, 3, 2, 1};
        int[] popArrB = {4, 5, 3, 1, 2};

        System.out.println(solution(pushArr, popArrA));
        System.out.println(solution(pushArr, popArrB));
    }

    private static boolean solution(int[] pushArr, int[] popArr) {
        if (pushArr.length == 0 || popArr.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0; //移动出栈序列元素
        for (int i = 0; i < pushArr.length; i++) {
            stack.push(pushArr[i]);
            while (!stack.empty() && (stack.peek() == popArr[j])) {
                stack.pop();//最后stack为空证明入栈和出栈序列满足要求
                j++;
            }
        }
        return stack.empty();
    }
}
