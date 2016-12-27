package com.selbylei.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by selbylei on 16/12/28.
 */
public class apacheio {
    public static void main(String[] args) {
        File file = new File("gym.txt");
        File file1 = new File("gymgym.txt");
        try {
            FileUtils.copyFile(file,file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
