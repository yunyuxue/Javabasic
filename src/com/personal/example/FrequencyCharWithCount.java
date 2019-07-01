package com.personal.example;

import java.util.*;

/**
 * @author ：song
 * @date ：Created in 2019/6/10 17:24
 * @description：一个字符串中出现的字母及次数，如有多个重复的则都求出。
 * @modified By：
 * @version: 1.0.0
 */
public class FrequencyCharWithCount {

    public static void main(String[] args){
        HashMap<Character, Integer> cacheMap = new HashMap<>();
        String refer = "abcdefghijklmnopqrsdtuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int point = random.nextInt(refer.length());
            sb.append(String.valueOf(refer.charAt(point)));
        }
          //sb.delete(0,sb.length());
        String smaple = sb.toString();
        for (int j = 0; j < smaple.length(); j++) {
            char temp = smaple.charAt(j);
            if(!cacheMap.containsKey(temp)){
                cacheMap.put(temp, 1);
            } else {
                cacheMap.put(temp, cacheMap.get(temp)+1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(cacheMap.entrySet());
        List<Map.Entry<Character, Integer>> list2 = new ArrayList<>(cacheMap.entrySet());
        List<Map.Entry<Character, Integer>> list3 = new ArrayList<Map.Entry<Character,Integer>>(cacheMap.entrySet());


        //值降序排列
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //键降序排列
        Collections.sort(list2, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
                return o2.getKey().compareTo(o1.getKey());
            }
        });

        //值升序排列Lambda实现
        Collections.sort(list3, (Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)-> {return o1.getValue().compareTo(o2.getValue());});

        System.out.println(list.toString());
        for(Map.Entry<Character, Integer> temp : list){
            if(temp.getValue() > 1){
                System.out.print(temp.getKey() + "=" + temp.getValue() + ", ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println(list2.toString());
        System.out.println("-----------------------------------------");
        System.out.println(list3.toString());
        System.out.println("-----------------------------------------");
        System.out.println(cacheMap.toString());
    }
}
