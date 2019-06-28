package com.personal.example;

import java.util.*;

/**
 * @author ：song
 * @date ：Created in 2019/6/12 11:44
 * @description：一个数组元素组成的所有序列。
 * @modified By：
 * @version: 1.0.0
 */
public class SeqCompositon {

    public static void main(String[] args){
        String[] array = new String[]{"1", "2", "2", "3", "4"};
        Set<String> set = new HashSet<String>();
        listEqualLengthAll(Arrays.asList(array), "", set);
        System.out.println(set.size());
        System.out.println(set.toString());
    }

    //列出所有的序列
    public static void listAll(List l, String prefix){

        System.out.println(prefix);

        for (int i = 0; i < l.size(); i++) {
            List temp = new ArrayList(l);
            listAll(temp, prefix + temp.remove(i));
        }
    }

    //列出和数组长度相同的序列；
    public static void listEqualLengthAll(List l, String prefix){
        if(prefix.length() == 5) {
            System.out.println(prefix);
        }
        for (int i = 0; i < l.size(); i++) {
            List temp = new ArrayList(l);
            listEqualLengthAll(temp, prefix + temp.remove(i));
        }
    }

    ////列出和数组长度相同的序列,根据数组中是否有重复元素，set自动去重
    public static void listEqualLengthAll(List l, String prefix, Set set){
        if(prefix.length() == 5) {
            set.add(prefix);
        }
        for (int i = 0; i < l.size(); i++) {
            List temp = new ArrayList(l);
            listEqualLengthAll(temp, prefix + temp.remove(i), set);
        }
    }
}
