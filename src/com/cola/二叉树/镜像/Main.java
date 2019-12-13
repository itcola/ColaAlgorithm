package com.cola.二叉树.镜像;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/10/2
 */
public class Main {
    static List<Integer> list = new ArrayList<>();

    static class TreeNode {
        Integer val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode() {
        }

        public TreeNode(Integer val) {
            this.val = val;
        }
    }


    private void solution(TreeNode root) {
        if (root == null) {
            return ;
        }
        list.add(root.val);
        solution(root.leftNode);
        solution(root.rightNode);

    }

    public static void main(String[] args) {
        Main m = new Main();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.leftNode = node2;
        node1.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.leftNode = node6;
        node3.rightNode = node7;

        m.solution(node1);
        System.out.println("镜像前："+list.toString());
        list.clear();

        m.reverse(node1);

        m.solution(node1);
        System.out.println("镜像后："+list.toString());

    }

    private void reverse(TreeNode root) {
        if (root.leftNode == null || root.rightNode == null || root == null) {
            return;
        }
        TreeNode temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;
        reverse(root.leftNode);
        reverse(root.rightNode);
    }
}
