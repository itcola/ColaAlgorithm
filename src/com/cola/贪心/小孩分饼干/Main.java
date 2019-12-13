package com.cola.贪心.小孩分饼干;

import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/10/2
 * <p>
 * 每个小孩想要饼干大小 child[i]
 * 每个饼干大小 cookie[i]
 * 求这些饼干能满足多少个小孩
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] child = {2, 4, 3,10,8};
        int[] cookie = {3, 2, 1,4};

        //对贪心的孩子从大到小排序 使其能够符合贪心 把最贪的小孩放在第一位
        Arrays.sort(child);
        for (int i = 0; i < child.length / 2; i++) {
            int temp = child[i];
            child[i] = child[child.length - 1 - i];
            child[child.length - 1 - i] = temp;
        }

        //对饼干的大小从大到小排序
        Arrays.sort(cookie);
        for (int i = 0; i < cookie.length / 2; i++) {
            int temp = cookie[i];
            cookie[i] = cookie[cookie.length - 1- i];
            cookie[cookie.length - 1 - i] =temp;
        }

        int result = 0;
        for(int i = 0 ; i < child.length ; ){
            for(int j = 0 ; j < cookie.length ; ){
                if(i >= child.length){
                    break;
                }
                if(child[i] <= cookie[j]){
                    result ++;
                    i++;
                    j++;
                }else{
                    i ++;
                }

            }

        }
        System.out.println(result);
    }
}
