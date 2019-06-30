package com.personal.basic.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author AlaneyS
 * @Date 2019/6/30 10:03
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class ThreadDemo3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> f = service.submit(new MyCallable());
        if(!f.isDone()){
            System.out.println("thread is not completed, wait for a while...");
        }
        try{
            System.out.println(f.get());
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            service.shutdown();
        }
    }
}
