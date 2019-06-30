package com.personal.basic.thread;

/**
 * @Author AlaneyS
 * @Date 2019/6/30 9:45
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("it is a thread-extened thread...");
        System.out.println("current thread is " + Thread.currentThread().getName());
    }
}
