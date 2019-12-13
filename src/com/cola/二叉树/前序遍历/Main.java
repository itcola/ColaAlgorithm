package com.cola.二叉树.前序遍历;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Author:cola
 * Date:2019/10/2
 * leetcode 144
 */
public class Main {
    static List<Integer> list = new ArrayList<>();
    private void solution(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        solution(root.left);
        solution(root.right);

    }

    public List solution2(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.pop();

            list.addFirst(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;

    }


    static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(Integer val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        TreeNode node = new TreeNode(1);
        TreeNode node1 = null;
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = null;
        TreeNode node6 = new TreeNode(6);
        node.left = node1;
        node.right = node2;
        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;
        m.solution(node);

        System.out.println(list.toString());
    }

    @Test
    public void run() {
    }
}
