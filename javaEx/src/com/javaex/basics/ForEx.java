package com.javaex.basics;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
//		forLoopEx();
//		continueEx();
//		breakEx();
		randomEx();
	}
	private static void randomEx() {
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.print(random + " ");
			
		}
		System.out.println();
		
		int i = 0;
		
		while(i < 6) {
			System.out.print((int)(Math.random() * 45) + 1);
			System.out.print(" ");
			i++;
		}
		System.out.println();
	}
	private static void breakEx() {
		
		int num = 1;
		
		while(true) {
			if(num % 6 == 0 && num % 14 == 0) 
				break;
			System.out.print(".");
			num++;
		}
		System.out.println("\n" + num);
		
	}
	private static void continueEx() {
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) 
				continue;
			System.out.println(i);
		}
	}
	private static void forLoopEx() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" +(dan*num));
			
		}
		scanner.close();
	}

}
