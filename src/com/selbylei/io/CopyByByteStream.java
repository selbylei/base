package com.selbylei.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by selbylei on 16/12/27.
 */
public class CopyByByteStream {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("android.avi");
            FileOutputStream fos = new FileOutputStream("android_bak.avi");
            byte input[] = new byte[100000];
            long before = System.currentTimeMillis();
            int count = 0;
            while (fis.read(input) != -1) {
                fos.write(input);
                count++;
            }
            fis.close();
            fos.close();
            System.out.println("读取了" + count + "次");
            System.out.println(System.currentTimeMillis()-before+"ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
