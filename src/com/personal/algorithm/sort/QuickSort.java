package com.personal.algorithm.sort;

/**
 * @Author AlaneyS
 * @Date 2019/7/3 16:06
 * @Description 快速排序：平均时间-O(NLogN)，最坏O(N^2)， 空间-O(1)，不稳定的排序
 * @Modified By
 * @Version: 1.0.0
 **/
public class QuickSort {
    public static void sort(Comparable[] c) {
        sort(c, 0, c.length - 1);
    }

    private static void sort(Comparable[] c, int low, int high) {
        if (high <= low) {
            return;
        }
        int cp = partition(c, low, high);
        sort(c, low, cp - 1);
        sort(c, cp + 1, high);
    }

    private static int partition(Comparable[] c, int low, int high) {
        int i = low;
        int j = high + 1;
        Comparable v = c[low];
        while (true) {
            while (SortUtils.less(c[++i], v)){
                if (i == high) break;
            }
            while (SortUtils.less(v, c[--j])){
                if (j == low) break;
            }
            if (i >= j){
                break;
            }
            SortUtils.swap(c, i, j);
        }
        SortUtils.swap(c, low, j);
        return j;
    }

    public static void main(String[] args){
        String[] strs = SortUtils.generateStrArray(62, 1);
        System.out.println("------before sort------");
        SortUtils.show(strs);
        sort(strs);
        System.out.println("------after ascend sort------");
        SortUtils.show(strs);
    }
}
