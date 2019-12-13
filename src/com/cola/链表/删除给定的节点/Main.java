package com.cola.链表.删除给定的节点;

/**
 * Author:cola
 * Date:2019/10/15
 * leetcode 237
 */
public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //这里给定的是要删除的node  不是头节点
    public void solution(ListNode node){
        if(node.next == null){
            node = null;
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
