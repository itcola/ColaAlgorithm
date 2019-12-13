package com.cola.链表.合并两个有序链表;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/10/19
 * leetcode 21
 */
public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3= new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode l11 = new ListNode(4);
        ListNode l22 = new ListNode(5);
        ListNode l33 = new ListNode(6);

        l11.next = l22;
        l22.next = l33;

        solution(l1, l11);
    }

    private static ListNode solution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;
        return dummyHead.next;
    }

    private static ListNode solution2(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        List<Integer> list = new ArrayList();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }

        int[] nums = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i ++) {
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);

        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for(int i = 1 ; i < nums.length ; i ++){
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }
    @Test
    public void run(){
        int i = "hello".indexOf("ll");
        System.out.println(i);
    }

}
