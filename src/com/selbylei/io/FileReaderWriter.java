package com.selbylei.io;

import java.io.*;

/**
 * Created by selbylei on 16/12/28.
 */
public class FileReaderWriter {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("img.png");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("img_bak2.png");
//            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw, true);
            String line = null;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
            pw.close();
            fw.close();
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
