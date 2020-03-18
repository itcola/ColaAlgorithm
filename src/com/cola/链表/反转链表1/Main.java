package com.cola.链表.反转链表1;

/**
 * Author:cola
 * Date:2019/9/18
 * 链表翻转
 * 双向链表没有必要翻转，因为每个节点都是指向两侧的
 */
public class Main {

    private static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    
    private static Node reverse2(Node head){
        if(head == null){
            return head;
        }
        Node cur = head.next;
        Node pre = head;
        pre.next = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head = node1;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

        System.out.println("-----------------------------");

        Node newHead = reverse2(node1);
        while (newHead != null) {
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }

}
