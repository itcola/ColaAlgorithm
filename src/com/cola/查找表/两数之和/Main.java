package com.cola.查找表.两数之和;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 1
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(solution(nums, target)));
    }

    private static int[] solution(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr= new int[2];
        for(int i = 0 ; i < nums.length ; i ++) {
            int result = target - nums[i];
            if(map.containsKey(result)){
                arr[0] = map.get(result);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
