package com.selbylei.io.randomaccessfile;

import java.io.File;

/**
 * Created by selbylei on 16/12/28.
 */
public class MultiWrite {

    static File file = new File("test.txt");

    public static void main(String[] args) {
        if (file.exists()) {
            file.delete();
        }
        new WriteFile(file,1).start();
        new WriteFile(file,2).start();
         new WriteFile(file,3).start();
        new WriteFile(file,4).start();
        new WriteFile(file,5).start();
    }
}
