package com.selbylei.io;


import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by selbylei on 16/12/27.
 */
public class WriteByteStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("textw.txt");
            String outString = "write 123456写出数据";
            byte output[] = outString.getBytes("UTF-8");
            fos.write(output);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
