package com.cola.查找表.字母异位词分组;

import java.util.*;

/**
 * Author:cola
 * Date:2019/10/13
 * leetcode 49
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> resultList = solution(strs);
        for (List<String> strings : resultList) {
            System.out.println(strings.toString());
        }
    }

    private static List<List<String>> solution(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
