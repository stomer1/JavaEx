package com.javaex.basics;
import java.util.Scanner;
public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
		consoleInputEx();
	}
	private static void consoleInputEx() {
		
		// 팁1 : Ctrl + Shift + o
		// 팁2 : 자동 완성 기능 활용 : Ctrl + Space 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		
		String name = scanner.next();
		
		System.out.print("나이:");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고" + age + "살입니다");
		
		scanner.close();
	}
	private static void consoleOutputEx() {
		//콘솔 출력
		//System.out -> 표준 출력
		//System.err -> 출력 에러
		System.out.print("Hello ");
		System.out.println("Java ");
		
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava"); // \t ->탭문자
		
		System.out.println("Hello, \"Java\"");
		String dir = "C:\\Windows\\System";
		System.out.println(dir);
		
		System.err.println("표준 에러 출력!");
	}

}
