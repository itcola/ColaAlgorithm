package com.cola.回溯.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/9/28
 */
public class Main {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    int[] book;

    public List<List<Integer>> permute(int[] nums) {
        book = new int[nums.length];
        solution(nums, 0);
        return result;
    }

    private void solution(int[] nums, int step) {
        if (step == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (book[i] == 0) {
                list.add(nums[i]);
                book[i] = 1;
                solution(nums, step + 1);
                book[i] = 0;
                list.remove(step);
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] arr = {1, 2, 3,4};
        List<List<Integer>> permute = m.permute(arr);
        for (List<Integer> integers : permute) {
            System.out.println(integers.toString());
        }
    }
}
