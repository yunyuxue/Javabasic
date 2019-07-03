package com.personal.algorithm;

import java.util.Arrays;

/**
 * @Author AlaneyS
 * @Date 2019/7/2 21:01
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class SortUtils {

    //c1<c2 return true
    public static boolean less(Comparable c1, Comparable c2){
        return  c1.compareTo(c2) < 0;
    }

    public static void swap(Comparable[] c, int i, int j){
        Comparable t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

    public static void show(Comparable[] c){
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

}
