package com.cola.查找表.有效的字母异位;

/**
 * Author:cola
 * Date:2019/10/12
 * leetcode 242
 */
public class Main {
    public static void main(String[] args) {
        String s = "cola";
        String t = "laco";
        System.out.println(solution(s, t));
    }

    private static boolean solution(String s, String t) {
        int[] ins = new int[26];

        for(char c : s.toCharArray()){
            ins[c-'a'] ++;
        }

        for(char c : t.toCharArray()){
            ins[c-'a'] --;
        }

        for(int i : ins){
            if(i > 0){
                return false;
            }
        }
        return true;
    }

}
