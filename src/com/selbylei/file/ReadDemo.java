package com.selbylei.file;

import java.io.*;

/**
 * Created by selbylei on 16/12/27.
 */
public class ReadDemo {
    public static void main(String[] args) {
        File file = new File("selbylei.txt");
        if (file.exists()) { //文件存在
            try {
                //读取文件操作
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, "utf-8");
                BufferedReader br = new BufferedReader(isr);

                String line = null;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                isr.close();
                fis.close();

                //文件写入操作
                File newFile = new File("newText.txt");
                FileOutputStream fos = new FileOutputStream(newFile);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write("我在上海\n");
                bw.write("我在苏州\n");
                bw.write("我在常州\n");
                bw.write("我在我家\n");
                bw.write("我在老婆家\n");
                bw.close();
                osw.close();
                fos.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
