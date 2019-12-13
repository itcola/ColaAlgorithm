package com.cola.查找表.根据字符出现频率排序;

import java.util.*;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 451
 */
public class Main {
    public static void main(String[] args) {
        String s = "cocacola";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        Map<Character, Integer> tempMap = new HashMap<>(map);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (Character c : tempMap.keySet()) {
                tempMap.put(c,tempMap.get(c) - 1);
                if(tempMap.get(c) == 0){
                    for(int j = 0 ; j < map.get(c) ;j ++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.reverse().toString();
    }


}
