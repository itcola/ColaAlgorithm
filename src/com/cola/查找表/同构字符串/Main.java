package com.cola.查找表.同构字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 205
 */
public class Main {
    public static void main(String[] args) {
        String s = "coca";
        String t = "memo";
        System.out.println(solution(s, t));
    }

    private static boolean solution(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
            }else{
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
