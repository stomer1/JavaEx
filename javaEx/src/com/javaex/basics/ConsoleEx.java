package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
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
