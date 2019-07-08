package com.personal.example;

import java.util.*;

/**
 * @Author AlaneyS
 * @Date 2019/7/7 21:23
 * @Description 用List数据结构实现列表中字符串按出现频率降低的字符串信息。
 * @Modified By
 * @Version: 1.0.0
 **/
public class ListRepeatStrDemo {

    public static void main(String[] args) {
        List<String> sample = generateStrList(20, 3);
        List<List<String>> result = new ArrayList<>();

        Collections.sort(sample);

        System.out.println(sample.toString());

        for (int i = 0; i < sample.size() ; i++) {
            String strTemp = sample.get(i);
            List<String> innerList = new ArrayList<>();
            innerList.add(strTemp);
            for (int j = 1; j < sample.size(); j++) {
                String strTT = sample.get(j);
                if(strTemp.equals(strTT)){
                    innerList.add(strTT);
                    i++;
                }
            }
            result.add(innerList);
        }

        System.out.println(result.toString());

        Collections.sort(result, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o2.size()- o1.size();
            }
        });

        //Lambda实现
        //Collections.sort(result, (List<String> o1, List<String> o2) -> {return o2.size()- o1.size();});

        System.out.println(result.toString());
    }

    public static List<String> generateStrList(int listSize, int strLength) {
        List<String> list = new ArrayList<String>(listSize);
        StringBuffer sb = new StringBuffer();
        String refer = "aaaaaaaaabbbbbbbbbbccccccccccccdddddddddddd";
        Random random = new Random();
        for (int j = 0; j < listSize; j++) {
            for (int i = 0; i < strLength; i++) {
                int point = random.nextInt(refer.length());
                sb.append(String.valueOf(refer.charAt(point)));
            }
            list.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return list;
    }
}
