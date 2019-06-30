package com.personal.basic.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author AlaneyS
 * @Date 2019/6/30 9:56
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class ThreadDemo2 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<String>(new MyCallable());
        Thread t = new Thread(task);
        t.start();
        if(!task.isDone()){
            System.out.println("thread is not completed, wait for a while...");
        }
        try{
            System.out.println(task.get());
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
