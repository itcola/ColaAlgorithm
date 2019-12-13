package com.cola.数组.两个大整数相加;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

/**
 * Author:cola
 * Date:2019/9/19
 * 为了防止两个大整数相加溢出，将两个大整数分别倒序存放在两个数组（数组的第一位即个位，符合我们正常加法运算）
 * 将两个数组的每一位相加存放在result数组，最后将result反转。
 * 在java这 int 和 long 最多存放10位
 */
public class Main {

    public static void main(String[] args) {
        solution("426709752318", "95481253129");
    }

    private static void solution(String s1, String s2) {
        int maxLength = s1.length() > s2.length() ? s1.length() + 1 : s2.length() + 1;

        int[] nums1 = new int[maxLength];
        for (int i = 0; i < s1.length(); i++) {
            nums1[i] = s1.charAt(s1.length() - 1 - i) - '0';
        }

        int[] nums2 = new int[maxLength];
        for (int i = 0; i < s2.length(); i++) {
            nums2[i] = s2.charAt(s2.length() - 1 - i) - '0';
        }

        int[] res = new int[maxLength];
        for (int i = 0; i < res.length; i++) {
            int sum = res[i] + nums1[i] + nums2[i];
            if (sum > 9) {
                res[i] = sum - 10;
                res[i + 1] = 1;
            } else {
                res[i] = sum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            sb.append(res[i]);
        }
        String result = sb.reverse().toString();

        StringBuilder sb2 = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) - '0' == 0 && !flag) {
                continue;
            }
            flag = true;
            sb2.append(result.charAt(i));
        }

        System.out.println(sb2.toString());
    }
}
