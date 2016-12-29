package com.selbylei.thread;

/**
 * Created by selbylei on 16/12/29.
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
