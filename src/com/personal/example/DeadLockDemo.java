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
        final String signalA = "A";
        final String signalB = "B";

        //holding signalA, needs signalB to entrant
        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized(signalA){
                    try{
                        System.out.println("In " + Thread.currentThread().getName() + " body, holding signalA...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(signalB){
                        System.out.println("In " + Thread.currentThread().getName() + " body, holding signalB...");
                    }
                }
            }
        }).start();

        //holding signalB, needs signalA to entrant
        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized(signalB){
                    try{
                        System.out.println("In " + Thread.currentThread().getName() + " body, holding signalB...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(signalA){
                        System.out.println("In " + Thread.currentThread().getName() + " body, holding signalA...");
                    }
                }
            }
        }).start();
    }
}
