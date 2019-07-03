package com.personal.algorithm.sort;

/**
 * @Author AlaneyS
 * @Date 2019/7/3 10:37
 * @Description 希尔排序是插入排序的特例，希尔因子h，时间-O(NLogN)， 空间-O(1)，不稳定的排序
 * @Modified By
 * @Version: 1.0.0
 **/
public class ShellSort {

    public static void sort(Comparable[] c){
        int N = c.length;
        int h = 1;
        while(h < N/3){
            h = h*3 + 1;
        }
        while(h >= 1){
            for(int i = h; i < N; i++){
                for (int j = i; j >= h && SortUtils.less(c[j], c[j - h]); j -= h) {
                    SortUtils.swap(c, j, j - h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args){
        String[] strs = SortUtils.generateStrArray(40, 3);
        System.out.println("------before sort------");
        SortUtils.show(strs);
        sort(strs);
        System.out.println("------after ascend sort------");
        SortUtils.show(strs);
    }
}
