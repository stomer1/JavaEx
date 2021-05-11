package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leaf-filtered.txt";
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = "";
			while((line = br.readLine())!=null) {
				
				if(line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					System.out.println("Found:" + line);
					
					bw.write(line);
					bw.newLine();
					
				}
			}
			
			br.close();
			bw.close();
			
			System.out.println("필터링 완료!");
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
