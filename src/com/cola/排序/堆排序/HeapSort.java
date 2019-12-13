package com.cola.排序.堆排序;

import java.util.Arrays;

/**
 * Author:cola
 * Date:2019/8/27
 *
 * 要想数组从小到大排序 首先要构建最大堆  然后不断删除堆顶元素 （堆删除堆顶元素不是真正的删除，而是将堆顶元素与最后一个元素进行交换，然后在调整最大堆，然后将数组的长度-1）
 *   构建最大堆 : 1.先计算出最后一个非叶子节点
 *               2.计算出这个节点的两个子节点的最大值
 *               3.比较父节点与子节点(最大的那个)的大小
 *                  如果父节点比任何一个子节点都大，直接跳出
 *                  否则，进行交换。
 *   对
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 7, 3, 8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        //把无序数组构建成最大堆
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downAdjust(arr, i, arr.length);
        }
        //删除堆顶元素
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downAdjust(arr, 0, i);
        }
    }

    private static void downAdjust(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childIndex = parentIndex * 2 + 1;

        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex = childIndex + 1;
            }
            if (temp >= arr[childIndex])
                break;

            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }
}
