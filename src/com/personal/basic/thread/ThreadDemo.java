package com.personal.basic.thread;

/**
 * @Author AlaneyS
 * @Date 2019/6/30 9:43
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Thread-extended thread start: ");
        Thread t1 = new MyThread();
        t1.start();
        try{
            //主线程睡眠1s，等待t1线程结束。
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Runnable-implemented thread start: ");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
