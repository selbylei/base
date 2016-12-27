package com.selbylei.file;

import java.io.File;

/**
 * Created by selbylei on 16/12/27.
 */
public class FileDemo2 {

    public static void main(String[] args) {
        File folder = new File("myFolder");
        if (folder.exists()){
            folder.delete();
        }else {
            if (folder.mkdirs()){
                System.out.println("文件夹创建成功");
            }else {
                System.out.println("文件家创建为成功");
            }
        }

    }
}
