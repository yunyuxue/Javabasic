package com.personal.basic.lang;

/**
 * @author ：song
 * @date ：Created in 2019/6/12 16:37
 * @description：静态代码块局部变量问题
 * @modified By：
 * @version: 1.0.0
 */
public class StaticPartialParamDemo {

    static{
        int i = 5;
    }

    static int x, y;

    public static void main(String[] args) {
        x--;
        testMethod();
        System.out.println(x + y++ + x);
        System.out.println(y);
    }

    public static void testMethod(){
        y = x++ + ++x;
        System.out.println(x);
        System.out.println(y);
    }
}
