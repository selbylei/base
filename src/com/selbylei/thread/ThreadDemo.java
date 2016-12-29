package com.selbylei.thread;

/**
 * Created by selbylei on 16/12/29.
 */
public class ThreadDemo {

    public static void main(String[] args) {
        //方式一
        Thread td1 = new MyThread("线程1");
        td1.setPriority(Thread.MAX_PRIORITY);
        Thread td2 = new MyThread("线程2");
        td1.start();
        try {
            td1.join(3);  //强制执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        td2.start();

        //方式二
        Thread td3 = new Thread(new MyRunnable("线程3"));
        Thread td4 = new Thread(new MyRunnable("线程4"));
        td3.start();
        td4.start();
    }
}
