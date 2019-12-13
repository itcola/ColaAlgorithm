package com.cola.字符串.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:cola
 * Date:2019/11/7
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new Main().fizzBuzz(15);
        System.out.println(list.toString());
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
