package com.cola.剑指offer.二维数组中的查找;

/**
 * Author:cola
 * Date:2020/2/28
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null ){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0;
        int column = columns - 1;

        while (row < rows && column >= 0) {
            if (target > matrix[row][column]) {
                row ++;
            }else if(target < matrix[row][column]){
                column --;
            }else{
                return true;
            }
        }
        return false;
    }
}
