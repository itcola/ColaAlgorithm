package com.cola.树.判断后续遍历;

/**
 * Author:cola
 * Date:2019/10/9
 * 最后一个是根节点，前边所有比根节点小的都是左子树，后边所有比根节点大的都是右子树
 * 先是 8
 * 然后是 6   和  10
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 7, 6, 9, 11, 10, 8};
        System.out.println(solution(arr, 0, arr.length - 1));
        int[] arr1 = {7, 5, 6, 9, 11, 10, 8};
        System.out.println(solution(arr1, 0, arr.length - 1));
    }

    private static boolean solution(int[] arr, int start, int end) {
        if (end <= start) {
            return true;
        }
        int i = start;
        for (; i < end; i++) {
            if (arr[i] > arr[end]) {
                break;  //此刻找到了右子树的第一个元素
            }
        }
        for (int j = i; j < end; j++) {
            if (arr[j] < arr[end]) {
                return false; //右子树如果有比根节点还小直接返回false
            }
        }
        return solution(arr, start, i - 1) && solution(arr, i, end - 1);
    }
}
