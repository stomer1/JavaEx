package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		whileInfinity();
		dowhileEx();
	}
	private static void dowhileEx() {
		int total = 0;
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력하세요: [0ㅇ면 종료]:");
			value = scanner.nextInt();
			total += value;
			
	}while (value != 0);
		System.out.println("합계:" + total);
		scanner.close();
	}
		
	private static void whileInfinity() {
		while(true) {
			System.out.println("Ctrl + c to quit");
		}
	}
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		int i = 1;
		
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			i++;
			
		}
		scanner.close();
	
	}
	private static void whileEx() {
		int num = 1;
		int total = 0;
		
		while (num <= 10) {
//			total = total + num;
			total += num;
			num++;
			
		}
		System.out.println("합산값 :" + total);
	}

}
