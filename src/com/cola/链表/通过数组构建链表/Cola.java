package com.cola.链表.通过数组构建链表;

/**
 * Author:cola
 * Date:2019/10/14
 */
public class Cola {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode cur = head;
        while( cur != null){
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = createLinkedList(arr);
        printLinkedList(head);
    }
}
