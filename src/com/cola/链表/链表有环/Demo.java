package com.cola.链表.链表有环;

import java.util.*;

/**
 * Author:cola
 * Date:2019/9/7
 */
public class Demo {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean hasCycle(Node head) {
        Set<Node> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static boolean isCycleByHashSet(LinkedList<Integer> list) {
        Set<Integer> set = new HashSet<>();

        for (Integer integer : list) {
            if (!set.contains(integer)) {
                set.add(integer);
            } else {
                return true;
            }
        }
        return false;
    }

    public static Node isCycle(Node head) {
        Node p1 = head;
        Node p2 = head;


        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2) {
                return p1;
            }
        }

        return null;
    }


    public static int cycleLength(Node meetingNode){
        Node p1 = meetingNode;
        Node p2 = meetingNode;
        int length = 0;

        while(true){
            p1 = p1.next;
            p2 = p2.next.next;
            length ++;

            if(p1 == p2){
                return length;
            }
        }
    }

    public static Node enterCycyleNode(Node head,Node meetingNode){
        Node p1 = head;
        Node p2 = meetingNode;

        while(true){
            p1 = p1.next;
            p2 = p2.next;

            if(p1 == p2){
                return p1;
            }
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(7);
        Node node5 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node4;

        Node meetingNode = isCycle(node1);

        if(meetingNode == null){
            System.out.println("无环");
        }else{
            System.out.println("有环");
            System.out.println("环的长度"+cycleLength(meetingNode));
        }

        Node enterNode = enterCycyleNode(node1, meetingNode);
        System.out.println("入环元素的值为"+enterNode.data);
    }

}
