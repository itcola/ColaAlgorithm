package com.cola.树.从上向下打印二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author:cola
 * Date:2019/10/9
 * 也是广度优先遍历  不管广度优先遍历是一个有向图还是一棵树，都要用到队列
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

    public static void main(String[] args) {
        BinaryTreeNode b1 = new BinaryTreeNode(8);
        BinaryTreeNode b2 = new BinaryTreeNode(6);
        BinaryTreeNode b3 = new BinaryTreeNode(10);
        BinaryTreeNode b4 = new BinaryTreeNode(5);
        BinaryTreeNode b5 = new BinaryTreeNode(7);
        BinaryTreeNode b6 = new BinaryTreeNode(9);
        BinaryTreeNode b7 = new BinaryTreeNode(11);

        b1.leftNode = b2;
        b1.rightNode = b3;
        b2.leftNode = b4;
        b2.rightNode = b5;
        b3.leftNode = b6;
        b3.rightNode = b7;

        solution(b1);
    }

    private static void solution(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (queue.size() > 0) {
            BinaryTreeNode node = queue.remove();
            System.out.println(node.value);
            if (node.leftNode != null) {
                queue.add(node.leftNode);
            }
            if (node.rightNode != null) {
                queue.add(node.rightNode);
            }
        }
    }
}
