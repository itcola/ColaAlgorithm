package com.cola.队列.优先队列;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Author:cola
 * Date:2019/10/16
 */
public class Main {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        PriorityQueue<Integer> queue = new PriorityQueue<>(com);
        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(7);

        for(int i = 0 ; i < 5 ; i ++){
            System.out.println(queue.poll());
        }

//        System.out.println(queue.poll());
//        System.out.println(queue.remove());
    }
}
