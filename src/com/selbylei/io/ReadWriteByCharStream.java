package com.selbylei.io;

import java.io.*;

/**
 * Created by selbylei on 16/12/27.
 */
public class ReadWriteByCharStream {

    public static void main(String[] args) {

        try {
            File file = new File("gym.txt");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            FileOutputStream fos = new FileOutputStream("gym_bak.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            char input[] = new char[100];
            int l = 0;
            while ((l = isr.read(input)) != -1) {
                 osw.write(input,0,l);
            }
            isr.close();
            fis.close();
            osw.close();
            fos.close();
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
