package com.cola.链表.两数相加2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/10/19
 * leetcode 2
 */
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;

        ListNode listNode = addTwoNumbers(l1, n1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        //addTwoNumbers(new ListNode(9),new ListNode(9));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        while (l1 != null) {
            sb1.append(String.valueOf(l1.val));
            l1 = l1.next;
        }

        StringBuilder sb2 = new StringBuilder();
        while (l2 != null) {
            sb2.append(String.valueOf(l2.val));
            l2 = l2.next;
        }

        int maxLength = sb1.length() > sb2.length() ? sb1.length() + 1 : sb2.length() + 1;
        int[] res = new int[maxLength];
        int[] nums1 = new int[maxLength];
        int[] nums2 = new int[maxLength];

        for (int i = 0; i < sb1.length(); i++) {
            nums1[i] = sb1.charAt(i) - '0';
        }
        for (int i = 0; i < sb2.length(); i++) {
            nums2[i] = sb2.charAt(i) - '0';
        }

        for (int i = 0; i < res.length; i++) {
            int sum = nums1[i] + nums2[i] + res[i];
            if (sum > 9) {
                res[i] = sum - 10;
                res[i + 1] = 1;
            } else {
                res[i] = sum;
            }
        }

        StringBuilder sb3 = new StringBuilder();
        boolean flag = false;
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] == 0 && !flag) {

            } else {
                flag = true;
                sb3.append(res[i]);
            }
        }

        String result = sb3.reverse().toString();

        ListNode head = new ListNode(result.charAt(0) - '0');
        ListNode cur = head;
        for (int i = 1; i < result.length(); i++) {
            cur.next = new ListNode(result.charAt(i) - '0');
            cur = cur.next;
        }
        return head;
    }
}
