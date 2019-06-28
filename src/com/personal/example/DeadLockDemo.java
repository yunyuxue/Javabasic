package com.personal.example;

/**
 * @author ：song
 * @date ：Created in 2019/6/3 17:15
 * @description：实现死锁
 * @modified By：
 * @version: 1.0.0
 */
public class DeadLockDemo {

    public static void main(String[] args){
        //两个信号量
        String signalA = "A";
        String signalB = "B";

        //每个线程拥有对方需要的信号且不放手，并需要对方拥有的信号；
        Thread ta = new Thread(new Runnable(){
        @Override
        public void run(){
            System.out.println("in thread A body..");
            synchronized(signalA){
                try{
                    Thread.sleep(1000);
                    System.out.println("hold signal A..");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(signalB){
                    System.out.println("need signal B in Thread A body..");
                }
            }
        }
    });

        Thread tb = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("in thread B body..");
                synchronized(signalB){
                    try{
                        Thread.sleep(1000);
                        System.out.println("hold signal B..");
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(signalA){
                        System.out.println("need signal A in Thread B body..");
                    }
                }
            }
        });

        ta.start();
        tb.start();
    }
}
