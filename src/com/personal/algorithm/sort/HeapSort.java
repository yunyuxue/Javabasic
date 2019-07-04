package com.personal.algorithm.sort;

/**
 * @Author AlaneyS
 * @Date 2019/7/4 10:25
 * @Description 堆排序：最差，平均，最好时间-O(NLogN)， 空间-O(1)
 * @Modified By
 * @Version: 1.0.0
 **/
public class HeapSort {

    public static void sort(Comparable[] c) {
        int N = c.length;
        for (int k = N / 2; k >= 1; k--) {
            sink(c, k, N);
        }
        while (N > 1) {
            exch(c, 1, N--);
            sink(c, 1, N);
        }
    }

    private static void sink(Comparable[] c, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(c, j, j + 1)) {
                j++;
            }
            if (!less(c, k, j)) {
                break;
            }
            exch(c, k, j);
            k = j;
        }
    }

    /**
     * @return boolean
     * @Author AlaneyS
     * @Description Helper functions for comparisons, Indices are "off-by-one" to support 1-based indexing.
     * @Date 16:01 2019/7/4
     * @Param [c, i, j]
     **/
    private static boolean less(Comparable[] c, int i, int j) {
        return c[i - 1].compareTo(c[j - 1]) < 0;
    }

    /**
     * @return void
     * @Author AlaneyS
     * @Description Helper functions for swaps, Indices are "off-by-one" to support 1-based indexing.
     * @Date 15:59 2019/7/4
     * @Param [c, i, j]
     **/
    private static void exch(Comparable[] c, int i, int j) {
        Comparable temp = c[i - 1];
        c[i - 1] = c[j - 1];
        c[j - 1] = temp;
    }

    public static void main(String[] args) {
        String[] strs = SortUtils.generateStrArray(11, 5);
        System.out.println("------before sort------");
        SortUtils.show(strs);
        sort(strs);
        System.out.println("------after ascend sort------");
        SortUtils.show(strs);
    }
}
