package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\"; // 경로 표기를 잘못 하셨습니다.
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_Buffered_copy.jpg";
	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
			
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] data = new byte[10240];
			int size = 0;
			
			while((size = bis.read(data)) !=-1) {
				bos.write(data);
				System.out.println(size + "바이트 복사했습니다");
				
			}
			bis.close();
			bos.close();
			
			System.out.println("파일을 복사 했습니다!");
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
