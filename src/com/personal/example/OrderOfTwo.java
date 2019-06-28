package com.personal.example;

import java.util.Scanner;

/**
 * @author ：song
 * @date ：Created in 2019/6/12 17:46
 * @description：判断一个数是不是2的阶次
 * @modified By：
 * @version: 1.0.0
 */
public class OrderOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = OrderOf2OrNot(n);
        if(b){
            System.out.println(n + "是2的阶层");
        } else {
            System.out.println(n + "不是2的阶层");
        }
    }

    private static boolean OrderOf2OrNot(int n) {
        if(((n & (n-1)) == 0) && n != 0){
            return true;
        }
        return false;
    }
}
