package com.cola.链表.反转链表2;

/**
 * Author:cola
 * Date:2019/10/14
 * leetcode 92   为解决!!!!!!!!!!!!!
 */


public class Main {
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 4;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode newList = solution(node1, m, n);
        while (newList != null) {
            System.out.println(newList.data);
            newList = newList.next;
        }

    }

    private static ListNode solution(ListNode head, int m, int n) {
        ListNode mNode = head;
        for (int i = 1; i < m; i++) {
            mNode = mNode.next;
        }

        ListNode nNode = head;
        for (int i = 1; i < n; i++) {
            nNode = nNode.next;
        }

        ListNode cur = mNode;
        while (cur != nNode) {
            ListNode next = cur.next;

            next.next = cur;
            cur = next;
        }

        ListNode pre = head;
        while (pre.next != mNode) {
            pre = pre.next;
        }

        mNode.next = nNode.next;
        pre.next = nNode;

        return head;
    }
}
