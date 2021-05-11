package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files";
	static String filename = rootPath + "primitives.txt";
	public static void main(String[] args) {
		readPrimitives();
//		writePrimitives();
	}
		private static void readPrimitives() {
			try {
				InputStream fis = new FileInputStream(filename);
				DataInputStream dis = new DataInputStream(fis);
				
				for(int i = 0; i < 2; i++) {
					String s = dis.readUTF();
					Boolean b = dis.readBoolean();
					int val = dis.readInt();
					float f = dis.readFloat();
					
					double d = dis.readDouble();
					System.out.printf("%s:%b:%d:%f%n", s, b, val, f);
			}
			}catch(FileNotFoundException e) {
				System.err.println("파일을 찾을 수 없습니다");
	}		catch(IOException e) {
				e.printStackTrace();
	}
//		private static void writePrimitives() {
			
//		}
		try {
			OutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(false);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("고길동");
			dos.writeBoolean(true);
			dos.writeInt(45);
			dos.writeFloat(99.9f);
			
			dos.close();
			
			System.out.println("기본데이터 타입 저장!");
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
