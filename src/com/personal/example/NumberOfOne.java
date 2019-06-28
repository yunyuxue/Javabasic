package com.personal.example;

import java.util.Scanner;

/**
 * @author ：song
 * @date ：Created in 2019/6/3 16:41
 * @description：给出一个整数N，用2进制表示时，1的个数
 * @modified By：
 * @version: 1.0.0
 */
public class NumberOfOne {

    //利用Integer类和String类的现成函数实现
    public static int oneCount(int n){
        String binaryStr = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binaryStr.length(); i++){
            char temp = binaryStr.charAt(i);
            String comp = Integer.toString(1);
            //String comp = String.valueOf(1);
            //转为字符串进行比较
            if(comp.equals(Character.toString(temp))){
                count ++;
            }
        }
        return count;
    }

    //先让整数（n）减一，再和自己进行与运算赋值给n，可以将该整数的最右边的1变为0，将1的个数count++，直到n变为0就可以得到结果
    public static int oneCount2(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count ++;
        }
        return count;
    }

    ////利用Integer类和Character类的现成函数实现
    public static int oneCount3(int n){
        String binaryStr = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binaryStr.length(); i++){
            char temp = binaryStr.charAt(i);
            //转为整数进行比较
            if(1 == Character.getNumericValue(temp)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = scanner.nextInt();
        System.out.println("oneCount（）输出：");
        System.out.println("转换为二进制时，1的个数为： " + oneCount(input));
        System.out.println("oneCount2（）输出：");
        System.out.println("转换为二进制时，1的个数为： " + oneCount2(input));
        System.out.println("oneCount3（）输出：");
        System.out.println("转换为二进制时，1的个数为： " + oneCount2(input));
    }
}
