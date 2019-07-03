package com.personal.algorithm;

/**
 * @Author AlaneyS
 * @Date 2019/7/2 21:05
 * @Description 选择排序：时间--最差、平均-O(N^2), 最好-O(NLogN), 空间-O(1)
 * @Modified By
 * @Version: 1.0.0
 **/
public class SelectionSort {

    public static void sort(Comparable[] c){
        int N = c.length;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i+1; j < N; j++){
                if(SortUtils.less(c[j],c[min])){
                    min = j;
                }
            }
            SortUtils.swap(c, i, min);
        }
    }

    public static void main(String[] args){
        String[] strs = {"dwaf", "grh", "jhytj", "etre", "nfnv", "emhj", "kil", "ouy", "qwe", "zzf", "xcv", "cnh", "abm", "lkj", "poi", "erf", "hhrt", "tyu"};
        sort(strs);
        SortUtils.show(strs);
    }
}
