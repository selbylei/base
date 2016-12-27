package com.selbylei.io;

import java.io.*;

/**
 * Created by selbylei on 16/12/28.
 */
public class ReadWriteByBufferCharStream {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("gym.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);


            FileOutputStream fos = new FileOutputStream("gym_bak2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(osw,true);

            String line = null; //读取一行

            while ((line=br.readLine())!=null) {
                 pw.println(line);
            }
//            bw.flush();
            pw.close();
            osw.close();
            fos.close();
            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
