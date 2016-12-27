package com.selbylei.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by selbylei on 16/12/27.
 * 工程相对路径为工程的文件夹
 */
public class FileDemo {
    public static void main(String[] args) {

        File file = new File("src/com/selbylei/file/hello.txt");
        if (file.exists()) {//文件
//            file.delete();
            File nameto = new File("hello.txt");
            file.renameTo(nameto);
        } else {
            try {
                //文件创建
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件无法创建");
            }

        }
    }
}
