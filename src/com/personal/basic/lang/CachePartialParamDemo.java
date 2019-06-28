package com.personal.basic.lang;

/**
 * @author ：song
 * @date ：Created in 2019/6/12 16:42
 * @description：缓存局部变量问题
 * @modified By：
 * @version: 1.0.0
 */
public class CachePartialParamDemo {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            //j++;
            //j = (j++); // j=0;
            j = ++j;    // j=100;
        }
        System.out.println(j);
    }
}
