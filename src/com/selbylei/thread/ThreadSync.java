package com.selbylei.thread;

/**
 * Created by selbylei on 16/12/29.
 * 线程同步
 * 同步代码块
 * synchronized (同步对象){
 * 需要同步的代码块;
 * }
 */
public class ThreadSync {

    static class MyRunnable implements Runnable {
        private int ticket = 5;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (this) {  //同步这个线程
//                     if (ticket>0){
//                         try {
//                             Thread.sleep(500);
//                             System.out.println("剩余车票:"+--ticket);
//                         } catch (InterruptedException e) {
//                             e.printStackTrace();
//                         }
//                     }
                    tell();
                }
            }
        }

        //同步方法
        public synchronized void tell(){
            if (ticket>0){
                try {
                    Thread.sleep(500);
                    System.out.println("剩余车票:"+--ticket);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.start();
        t2.start();
        t3.start();

    }

}
