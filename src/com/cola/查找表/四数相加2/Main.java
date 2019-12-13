package com.cola.查找表.四数相加2;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2019/10/13
 * leetcode 454
 */
public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {-2,-1};
        int[] arr3 = {-1,2};
        int[] arr4 = {0,2};
        System.out.println(solution(arr1, arr2, arr3, arr4));
    }

    private static int solution(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < C.length ; i ++){
            for(int j = 0 ; j < D.length ;j ++){
                if(!map.containsKey(C[i]+D[j])){
                    map.put(C[i]+D[j],0);
                }else{
                    map.put(C[i]+D[j],map.get(C[i]+D[j])+1);
                }
            }
        }

        int result = 0;
        for(int i = 0 ; i < A.length ; i ++){
            for(int j = 0 ; j < B.length; j++){
                if(map.containsKey(0-A[i]-B[j])){
                    result += map.get(0 - A[i] - B[j]);
                }
            }
        }
        return result;
    }
}
