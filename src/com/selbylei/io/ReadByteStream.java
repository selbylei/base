package com.selbylei.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by selbylei on 16/12/27.
 */
public class ReadByteStream {
    public static void main(String[] args) {
        try {
            //创建字节流
            FileInputStream fis = new FileInputStream("text.txt");
            //已byte[]形式去读取，每次读取10个字节
            byte input[] = new byte[17];
            fis.read(input);
            String str = new String(input,"utf-8");
            System.out.println(str);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
