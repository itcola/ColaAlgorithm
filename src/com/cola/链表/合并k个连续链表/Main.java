package com.cola.链表.合并k个连续链表;

import com.cola.链表.通过数组构建链表.Cola;

import java.util.*;

/**
 * Author:cola
 * Date:2019/11/23
 * leetcode 23
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
        Set<Integer> set = new HashSet<>();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead.next;
        while (!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next != null) {
                pq.add(cur.next);
            }
        }
        return dummyHead.next;
    }

}
