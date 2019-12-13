package com.cola.字符串.翻转单词顺序;

/**
 * Author:cola
 * Date:2019/11/25
 */
public class Main {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] strings = str.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
