package com.hear.thread;

/**
 * @description:
 * @author: WANGJR
 * @create: 2018-12-28 23:28
 **/
public class ThreadCode {
    public static void main(String[] args) {
        Runnable runnable = new Thread1();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //正确地关闭线程
        ((Thread1) runnable).flag = false;
    }
}
