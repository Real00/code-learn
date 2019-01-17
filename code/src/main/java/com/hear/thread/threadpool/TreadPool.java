package com.hear.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: java线程池练习
 * @author: WANGJR
 * @create: 2018-12-29 14:21
 **/
public class TreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                                                5,
                                                30,
                                                TimeUnit.SECONDS,
                                                new ArrayBlockingQueue<Runnable>(2));
        threadPoolExecutor.execute(new Thread(()-> System.out.println(Thread.currentThread().getName()+"hello world")));
        threadPoolExecutor.execute(new Thread(()-> System.out.println(Thread.currentThread().getName()+"hello world")));
        threadPoolExecutor.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"hello world");
            }
        }));
    }
}
