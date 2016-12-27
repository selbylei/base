package com.selbylei.io.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by selbylei on 16/12/28.
 */
public class ReadFile {

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("gym.txt", "r");
            raf.seek(0);
            System.out.println(new String(raf.readLine().getBytes("ISO-8859-1"),"utf-8"));//需要重新转码才能正常显示
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
