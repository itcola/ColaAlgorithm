package com.cola.广度优先遍历.层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author:cola
 * Date:2019/10/15
 * leetcode 102
 */
public class Main {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 解法一  迭代
     * @param root
     * @return
     */
    public static List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            while (level > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    ((LinkedList<TreeNode>) queue).add(node.left);
                }
                if (node.right != null) {
                    ((LinkedList<TreeNode>) queue).add(node.right);
                }
                level--;
            }
            res.add(list);
        }
        return res;
    }


    /**
     * 解法二 递归
     */
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return result;
        }
        solution(root,0);
        return result;
    }

    public void solution(TreeNode node,int level){
        if(result.size() == level){
            result.add(new ArrayList());
        }
        result.get(level).add(node.val);

        if(node.left !=null){
            solution(node.left,level+1);
        }
        if(node.right != null){
            solution(node.right,level+1);
        }
    }
}
