package com.selbylei.io;

import java.io.*;

/**
 * Created by selbylei on 16/12/27.
 */
public class ReadByBufferByteStream {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("gym.txt");
            BufferedInputStream bis = new BufferedInputStream(fis,1000);

            FileOutputStream fos = new FileOutputStream("gym1111.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos,1000);

            byte input[] = new byte[100];
            int count = 0;
            long before = System.currentTimeMillis();
            int length=0;
            while ((length=bis.read(input) )!= -1) {
                bos.write(input,0,length);
                count++;
            }
            bos.flush();
            bis.close();
            bos.close();
            fis.close();
            fos.close();
            System.out.println("读取了" + count + "次");
            System.out.println(System.currentTimeMillis()-before+"ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
