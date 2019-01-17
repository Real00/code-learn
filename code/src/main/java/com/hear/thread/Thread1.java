package com.hear.thread;

import java.util.Random;

public class Thread1 implements Runnable {
    /**
     * 线程关闭标志
     */
    public boolean flag = true;
    /**
     * 线程执行次数
     */
    private int time = 1;
    /**
     * 线程公共变量
     */
    private int commValue = 0;
    private final Object lockObject = new Object();
    /**
     * 判断线程是否被占用
     */
    private boolean userFlag = false;

    @Override
    public void run() {
        while (flag) {
            synchronized (lockObject){
                while (userFlag){
                    try {
                        lockObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                userFlag = true;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //随机在公共变量增加一个值
                System.out.println(Thread.currentThread().getName() + "当前公共变量为："+commValue);
                //随机增加
                Random random = new Random();
                int randomValue = random.nextInt(10);
                System.out.println(Thread.currentThread().getName() + "公共变量随机增加："+randomValue);
                commValue += randomValue;
                System.out.println(Thread.currentThread().getName() + "：thread run" + time++);
                Thread.yield();
                userFlag = false;
                lockObject.notifyAll();
            }

        }
    }


}