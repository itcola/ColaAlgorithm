package com.cola.二叉树.将有序数组转换为二叉搜索树;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 108 递归 分治
 */
public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-10, -5, 0, 5, 10};
        solution(nums);
    }

    private static TreeNode solution(int[] nums) {
        return solution(nums, 0, nums.length - 1);
    }

    private static TreeNode solution(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = solution(nums, l, mid - 1);
        node.right = solution(nums, mid + 1, r);
        return node;
    }
}
