package com.selbylei.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class MultiWriteFile {
	
	static File file = new File("test.txt");

	public static void main(String[] args) {
 		if (file.exists()) {
			file.delete();
		}
		new WriteFile(file, 5).start();
		new WriteFile(file, 3).start();
		new WriteFile(file, 1).start();
		new WriteFile(file, 4).start();
		new WriteFile(file, 2).start();

		//			RandomAccessFile raf = new RandomAccessFile(file, "r");
//			raf.seek(300);
//			byte[] str = new byte[20];
//			raf.read(str);
//			String in = new String(str);
//			System.out.println(in);


	}

}
