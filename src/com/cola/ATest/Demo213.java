package com.cola.ATest;

/**
 * Author:cola
 * Date:2020/2/13
 */
public class Demo213 {
    static String name;
    static int age;

    public static void main(String[] args) {
        Demo213 demo1 = new Demo213();
        Demo213 demo2 = new Demo213();
        demo1.name = "cola";
        System.out.println(demo1.name);
        System.out.println(demo2.name);
        System.out.println(Demo213.name);


        demo1.age = 1;
        System.out.println(demo1.age);
        System.out.println(demo2.age);
    }
}
