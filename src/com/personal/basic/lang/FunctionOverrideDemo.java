package com.personal.basic.lang;

/**
 * @author ：song
 * @date ：Created in 2019/6/12 10:46
 * @description：方法重载例子
 * @modified By：
 * @version: 1.0.0
 */
public class FunctionOverrideDemo {

    //重载：方法名相同，参数类型、个数、顺序不同；与返回类型无关。
    public int testDemo(String str, Integer i){
        System.out.println(str + i);
        return i;
    }

    public int testDemo(String str, int i){
        System.out.println(str + i);
        return i;
    }

    public int testDemo(int i, String str){
        System.out.println(str + i);
        return i;
    }

    public Integer testDemo(Integer i, String str){
        System.out.println(str + i);
        return i;
    }
}
