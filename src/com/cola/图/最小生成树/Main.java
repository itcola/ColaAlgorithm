package com.cola.图.最小生成树;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import javax.print.attribute.standard.PrinterResolution;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/9/23
 * 每次从集合中拿出一个点
 * 找这个点能到权值最小的点
 * 每次从顶点出发，找到这个点能到达点的最小权值  放入能到达的顶点 放入数组
 */
public class Main {
    final static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 4, 3, INF, INF},
                {4, 0, 8, 7, INF},
                {3, 8, 0, INF, 1},
                {INF, 7, INF, 0, 9},
                {INF, INF, 1, 9, 0}
        };
        int[] result = solution(matrix);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[][] matrix) {
        //创建一个能到达顶点的集合
        //创建一个最小生成树数组
        //初始化三个值
        //循环遍历，每次从集合的第一个顶点出发，每次找到权值最小的，然后添加到集合，添加到数组
        //返回
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int[] result = new int[matrix.length];
        result[0] = -1;
        int fromIndex = 0, toIndex = 0 , weight;

        while (list.size() < matrix.length) {
            weight = INF;
            for (Integer vertex : list) { //每次都从集合的第一个顶点出发 寻找最小权值
                for (int i = 0; i < matrix.length; i++) {
                    if (!list.contains(i)) {
                        if (matrix[vertex][i] < weight) {
                            fromIndex = vertex;
                            toIndex = i;
                            weight = matrix[vertex][i];
                        }
                    }
                }
            }
            list.add(toIndex);
            result[toIndex] = fromIndex;
        }

        return result;
    }

}
