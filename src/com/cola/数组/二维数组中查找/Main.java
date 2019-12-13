package com.cola.数组.二维数组中查找;

/**
 * Author:cola
 * Date:2019/11/24
 * offer 1
 */
public class Main {

    /**
     * 优化版， 从左到右增大， 从上到下增大。
     * O(longn)
     *
     * @param array
     * @return
     */
    public boolean solution(int[][] array, int target) {
        //从左下角开始，大了向上，小了向右
        int row = array.length;
        int col = array[0].length;
        int i = row - 1, j = 0; //从左下角开始
        while (i >= 0 && j < col) {
            if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 暴解 O(n)
     *
     * @param target
     * @param array
     * @return
     */
    public boolean solution2(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
