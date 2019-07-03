package com.personal.algorithm.sort;

/**
 * @Author AlaneyS
 * @Date 2019/7/3 10:06
 * @Description 插入排序： 时间--最差、平均-O(N^2), 最好-O(N), 空间-O(1), 稳定的排序
 * @Modified By
 * @Version: 1.0.0
 **/
public class InsertionSort {

    public static void sort(Comparable[] c){
        int N = c.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && SortUtils.less(c[j],c[j-1]); j--){
                SortUtils.swap(c, j, j-1);
            }
        }
    }

    public static void main(String[] args){
        String[] strs = SortUtils.generateStrArray(12, 3);
        System.out.println("------before sort------");
        SortUtils.show(strs);
        sort(strs);
        System.out.println("------after ascend sort------");
        SortUtils.show(strs);
    }
}
