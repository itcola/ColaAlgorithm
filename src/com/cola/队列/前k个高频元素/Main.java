package com.cola.队列.前k个高频元素;

import java.util.*;

/**
 * Author:cola
 * Date:2019/10/16
 * leetcode 347
 */
public class Main {

    static class Element {
         int val;   //注意属性不要加static 不然创建的各个对象 他们的值都是一样的
         int freq;

        public Element(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Comparator<Element> com = new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.getFreq() - o2.getFreq();
            }
        };

        Queue<Element> queue = new PriorityQueue<>(com);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(new Element(entry.getKey(), entry.getValue()));
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.poll().getVal());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        List<Integer> integers = topKFrequent(arr, 3);
        System.out.println(integers.toString());
    }
}