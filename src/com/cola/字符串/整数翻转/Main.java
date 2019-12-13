package com.cola.字符串.整数翻转;

/**
 * Author:cola
 * Date:2019/10/19
 * leetcode 7
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1534236469));
    }

    private static int solution(int x) {
        if(x == 0){
            return x;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        if (s.charAt(0) == '-') {
            for (int i = s.length() - 1; i > 0; i--) {
                sb.append(s.charAt(i));
            }
            s = sb.toString();
            while (s.startsWith("0")){
                s = s.substring(1,s.length());
            }
            s = "-" + s;
        }else{
            for(int i = s.length() - 1 ; i >= 0 ; i--){
                sb.append(s.charAt(i));
            }
            s = sb.toString();
            while(s.startsWith("0")){
                s = s.substring(1,s.length());
            }
        }
        long res = Long.parseLong(s) < Integer.MAX_VALUE && Long.parseLong(s) > Integer.MIN_VALUE ? Long.parseLong(s) : 0;

        s = String.valueOf(res);
        int i = Integer.parseInt(s);
        return i;
    }
}
