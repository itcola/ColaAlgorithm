package com.cola.二叉树.路径和;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author:cola
 * Date:2019/10/10
 * leetcode 25
 */
public class Main {
    static class BinaryTreeNode {
        int value;
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }

    private static void solution(BinaryTreeNode root, int sum, int exceptionValue, List<Integer> list) {
        sum += root.value;
        list.add(root.value);

        //如果是叶子节点并且值为预期得到的值
        if (root.leftNode == null && root.rightNode == null && sum == exceptionValue) {
            System.out.println(list.toString());
        }

        //如果不是叶子节点
        if (root.leftNode != null) {
            solution(root.leftNode, sum, exceptionValue, list);
        }
        if (root.rightNode != null) {
            solution(root.rightNode, sum, exceptionValue, list);
        }
        sum -= root.value;
        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {
        BinaryTreeNode b1 = new BinaryTreeNode(10);
        BinaryTreeNode b2 = new BinaryTreeNode(5);
        BinaryTreeNode b3 = new BinaryTreeNode(12);
        BinaryTreeNode b4 = new BinaryTreeNode(4);
        BinaryTreeNode b5 = new BinaryTreeNode(7);

        b1.leftNode = b2;
        b1.rightNode = b3;
        b2.leftNode = b4;
        b2.rightNode = b5;

        List<Integer> list = new ArrayList<>();
        int exceptionValue = 22;
        int sum = 0;
        solution(b1, sum, exceptionValue, list);
    }
}
