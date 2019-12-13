package com.cola.递归.电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:cola
 * Date:2019/9/26
 */
public class ColaTest {
    public String str = "";
    List<String> list = new ArrayList<String>();
    List<String> resultList = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        System.out.println(resultList);
        if (digits.length() == 0) {
            return null;
        }
        initWord();
        cola(digits, 0, str);
        return resultList;
    }

    private void cola(String digits, int index, String str) {
        if (index == digits.length()) {
            resultList.add(str);
            return;
        }

        // 拿到这个数字字符串的每一位
        char c = digits.charAt(index);

        //这位数字能代表哪些字母
        String letter = list.get(c - '0');

        //遍历 递归
        for (int i = 0; i < letter.length(); i++) {
            cola(digits, index + 1, str + letter.charAt(i));
        }

    }

    public static void main(String[] args) {
        ColaTest s = new ColaTest();
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        List<String> rl = s.letterCombinations(digits);
        System.out.println(rl.toString());
    }


    private void initWord() {
        list.add("");  // 0
        list.add("");  // 1
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wxyz");
    }


}
