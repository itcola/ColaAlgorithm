package com.cola.链表.回文链表;

/**
 * Author:cola
 * Date:2019/11/7
 * leetcode 234
 *
 * 对于链表 1 2 3 3 2 1  通过slow得到的是第一个3  偶数的情况下 正好也是从下一个数作为新链表头节点
 * 对于链表 1 2 3 2 1 通过slow 得到的是3  奇数情况下不需要考虑中间的数 只需两边的数都相等即可
 */
public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }


    /**
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next; //最后slow指针就是中间的指针
            fast = fast.next.next;
        }

        //翻转中间到后边的链表
        ListNode reverseHead = reverse(slow.next);

        while (reverseHead != null) {
            if (reverseHead.val != head.val) {
                return false;
            }
            reverseHead = reverseHead.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
