package com.cola.数组.扑克牌顺子;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/12/6
 */
public class Main {
    public boolean isContinuous(int[] numbers) {
        //排序
        //查看有几个0
        //查看从0后的第一个数字与其后边的数字的差值
        //如果有两个一样的数字 则代表有 对，那么就不能是顺子了

        if (numbers.length < 1 || numbers == null) {
            return false;
        }

        int zero = 0;
        int gap = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero++;
            }
        }

        int small = zero;
        int big = small + 1;
        while (big < numbers.length) {
            if (numbers[big] == numbers[small]) {
                return false;
            }
            gap += numbers[big] - numbers[small] - 1;
            small ++;
            big ++;
        }

        return gap <= zero ? true : false;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,5,0};
        new Main().isContinuous(arr);
    }
}
