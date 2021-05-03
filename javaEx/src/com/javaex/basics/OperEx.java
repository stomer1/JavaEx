package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		arithOperEx();

	}
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		
		System.out.println(a + "/" + b + "=" + (a/b));
		System.out.println("a를 b로 나눈 나머지:" + (a%b));
		
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		
		System.out.println("---------");
		
		a = 7;
		System.out.println("a:" +a);
		System.out.println("전위 증감연산:" + (++a));
		System.out.println("최종 a:"+a);
		
		a = 7;
		System.out.println("a:" +a);
		System.out.println("후위 증감연산:" + (a++));
		System.out.println("최종 a:"+ a);
		
		a = 7;
//		System.out.println(a / 0);
		System.out.println((float)a / 0);
		
		System.out.println("7.0 / 0은 유한수인가?"+ Double.isFinite(7.0/0));
		System.out.println("0.0/0.0?" + (0.0/0.0));
		System.out.println("0.0 / 0.0 is NaN?"+ Double.isNaN(0.0 / 0.0));
		System.out.println(0.0 / 0.0 + 10);
	}
}
