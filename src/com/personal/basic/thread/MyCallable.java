package com.personal.basic.thread;

import java.util.concurrent.Callable;

/**
 * @Author AlaneyS
 * @Date 2019/6/30 9:54
 * @Description TODO
 * @Modified By
 * @Version: 1.0.0
 **/
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String temp = "it is the returned string";
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return temp;
    }
}
