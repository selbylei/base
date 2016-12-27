package com.selbylei.collection;

import java.io.File;

/**
 * Created by selbylei on 16/12/27.
 * 集合接口
 * 常用子类：
 * list,set,queue
 *
 */
public class CollectionDemo {

    public static void main(String[] args) {

        File file = new File("hello.text");
        if (file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }else{
            System.out.println("文件不存在");
        }
    }
}
