package com.cola.链表.删除倒数第n个节点;

/**
 * Author:cola
 * Date:2019/10/15
 * leetcode 19
 */
public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 双指针模式
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode solution2(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode p = dummyHead;
        ListNode q = dummyHead;

        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;

        return dummyHead.next;

    }

    public ListNode solution(ListNode head, int n) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        ListNode node = head;
        for (int i = 1; i < length - n; i++) {
            node = node.next;
        }

        node.next = node.next.next;

        return head;

    }

}
