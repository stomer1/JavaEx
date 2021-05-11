package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] insrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 출력 타겟
		byte[] target = null;
		
		System.out.println("입력 소스:" + Arrays.toString(insrc));
		
		try {
			InputStream bis = new ByteArrayInputStream(insrc);
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0;
			
			while((data = bis.read()) !=-1) {
				System.out.println("Read Data: " + data);
				bos.write(data);
			}
			target = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("tager: " + Arrays.toString(target));
			
			bos.close();
			bis.close();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			
		}

	}

}
