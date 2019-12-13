package com.cola.查找表.回旋镖的数量;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2019/10/13
 * leetcode 447
 */
public class Main {
    public static void main(String[] args) {
        int[][] points = {
                {0, 0},
                {1, 0},
                {2, 0}
        };
        int[][] points1 = {
                {1, 1},
                {2, 2},
                {3, 3}
        };
        System.out.println(solution(points1));
    }

    private static int solution(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {  //i这个点到不是i这个的所有点的不同的距离作为key , 如果两个距离一样 则是解
                if (i != j) { //这个判断是精华
                    Integer key = dis(points[i], points[j]);
                    if (!map.containsKey(key)) {
                        map.put(key, 1);
                    } else {
                        map.put(key, map.get(key) + 1);
                    }
                }
            }
            for (Integer value : map.values()) {
                if (value >= 2) {
                    result += value * (value - 1); //这里是因为几个点调换位置同样也是解
                }
            }
        }
        return result;
    }

    /**
     * 距离的求解 是 根号下 （x1 - y1)^2  + (x2 - y2)^2   但是开根号后可能出现浮点数  所以在这里不开根号虽然不是距离 但是每两个点都这样求 结果还是对的
     *
     * @param i
     * @param j
     * @return
     */
    private static Integer dis(int[] i, int[] j) {
        return (i[0] - j[0]) * (i[0] - j[0]) + (i[1] - j[1]) * (i[1] - j[1]);
    }
}
