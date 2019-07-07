package com.personal.example;

/**
 * @Author AlaneyS
 * @Date 2019/7/7 20:59
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class Singleton {
    private Singleton(){};

    private static Singleton singleton = null;

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //加锁
    public static synchronized Singleton getSingleton2(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //双重检查锁定
    public static Singleton getSingleton3(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    //内部静态持有类, 既实现了线程安全，又避免了同步带来的性能影响。
    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
