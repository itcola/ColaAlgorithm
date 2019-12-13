package com.cola.广度优先遍历.完全平方数;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:cola
 * Date:2019/10/16
 * leetcode 279
 * 通过广度优先遍历 最短路径的方式
 */
public class Main {
    static class Element {
        int num;
        int step;

        public Element(int num, int step) {
            this.num = num;
            this.step = step;
        }
    }

    public static int solution(int n) {
        boolean[] flag = new boolean[n + 1];
        Queue<Element> queue = new LinkedList<>();
        ((LinkedList<Element>) queue).add(new Element(n, 0));
        flag[n] = true;

        while (!queue.isEmpty()) {
            Element ele = queue.poll();
            int num = ele.num;
            int step = ele.step;

            if (num == 0) {
                return step;
            }

            for (int i = 1; num - i * i >= 0; i++) {
                if (!flag[num - i * i]) {  //后到的元素指定比先到的元素走的步数要多  所以每个元素只能使用一次就可以了
                    ((LinkedList<Element>) queue).add(new Element(num - i * i, step + 1));
                    flag[num - i * i] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
