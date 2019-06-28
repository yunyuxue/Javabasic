package com.personal.basic.lang;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：song
 * @date ：Created in 2019/6/3 17:53
 * @description：String相关类的使用
 * @modified By：
 * @version: 1.0.0
 */
public class StringDemo {

    public static void main(String[] args) {
        String[] comp = new String[10];
        StringBuffer sb = new StringBuffer();
        String refer = "abcdefghijklmnopqrsdtuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        for(int j = 0; j < comp.length; j++) {
            for (int i = 0; i < 10; i++) {
                int point = (int)(Math.random()*(refer.length()));
                int point2 = Math.abs(random.nextInt()%(refer.length()));
                int point3 = random.nextInt(refer.length());
                sb.append(String.valueOf(refer.charAt(point3)));
            }
            comp[j] = sb.toString();
            sb.delete(0,sb.length());
        }
        System.out.println("String[] comp : " + Arrays.toString(comp));
        String delimeter = "-";
        String result = String.join(delimeter,comp);
        System.out.println("result: " + result);

        String[] splitStr = result.split("-");
        System.out.println("String[] splitStr : " + Arrays.toString(splitStr));
    }

}
