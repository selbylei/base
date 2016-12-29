package com.selbylei.thread;

/**
 * Created by selbylei on 16/12/29.
 */
public class MyRunnable implements Runnable {

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(name + ":" + i);
        }

    }
}
