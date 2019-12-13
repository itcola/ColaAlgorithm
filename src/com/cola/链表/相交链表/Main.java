package com.cola.链表.相交链表;

/**
 * Author:cola
 * Date:2019/10/20
 * leetcode 160
 */
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(0);
        ListNode r3 = new ListNode(1);
        ListNode r4 = new ListNode(8);
        ListNode r5 = new ListNode(4);
        ListNode r6 = new ListNode(5);

        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = r6;

        ListNode intersectionNode = getIntersectionNode(l1, r1);
        System.out.println(intersectionNode.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        while (l1 != null) {
            ListNode l2 = headB;
            while (l2 != null) {
                if (l1.val == l2.val) {
                    ListNode res1 = l1;
                    ListNode res2 = l2;
                    while (res1.val == res2.val) {
                        if (res1.next == null) {
                            if (res2.next == null) {
                                return l1;
                            }
                        }
                        res1 = res1.next;
                        res2 = res2.next;
                    }
                }
                l2 = l2.next;
            }
            l1 = l1.next;
        }

        return null;
    }
}
