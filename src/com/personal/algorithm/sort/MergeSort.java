package com.personal.algorithm.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author AlaneyS
 * @Date 2019/7/3 12:02
 * @Description 归并排序： 最差，平均，最坏时间-O(NLogN)， 空间-O(N)，稳定的排序
 * @Modified By
 * @Version: 1.0.0
 **/
public class MergeSort {
    private static Comparable[] assit;

    //自顶向下归并
    public static void sortUpToBottom(Comparable[] c) {
        assit = new Comparable[c.length];
        sort(c, 0, c.length - 1);
    }

    private static void sort(Comparable[] c, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(c, low, mid);
        sort(c, mid + 1, high);
        merge(c, low, mid, high);
    }

    //自底向上归并
    public static void sortBottomToUp(Comparable[] c) {
        int N = c.length;
        assit = new Comparable[N];
        for (int childArrSize = 1; childArrSize < N; childArrSize = childArrSize + childArrSize) {
            for (int low = 0; low < N - childArrSize; low += childArrSize + childArrSize) {
                merge(c, low, low + childArrSize - 1, Math.min(low + childArrSize + childArrSize - 1, N - 1));
            }
        }
    }

    //原地归并的抽象方法
    private static void merge(Comparable[] c, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            assit[k] = c[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                c[k] = assit[j++];
            } else if (j > high) {
                c[k] = assit[i++];
            } else if (SortUtils.less(assit[j], assit[i])) {
                c[k] = assit[j++];
            } else {
                c[k] = assit[i++];
            }
        }
    }

    public static void main(String[] args) {
        String[] strs = SortUtils.generateStrArray(10, 8);
        System.out.println("------before sort------");
        SortUtils.show(strs);
        System.out.println("------after ascend sort------");
        System.out.println("--Up to Bottom--");
        sortUpToBottom(strs);
        SortUtils.show(strs);
        System.out.println("--shuffle the strs--");
        List<String> list = Arrays.asList(strs);
        Collections.shuffle(list);
        strs = (String[])list.toArray();
        SortUtils.show(strs);
        System.out.println("--Bottom to Up--");
        sortBottomToUp(strs);
        SortUtils.show(strs);
    }
}
