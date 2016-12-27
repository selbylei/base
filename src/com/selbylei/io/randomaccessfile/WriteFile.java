package com.selbylei.io.randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by selbylei on 16/12/28.
 */
public class WriteFile extends Thread {
    File file;
    int block = 0;
    final int L = 100;


    public WriteFile(File f, int b) {
        this.file = f;
        this.block = b;
    }

    @Override
    public void run() {
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek((block - 1) * L);
            raf.writeBytes("This block is "+block);
            raf.writeBytes("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
