package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
//		arithOperEx();
//		logicOper();
		bitOper();
	}
	//비트연산자
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1:" + Integer.toBinaryString(b1));
		System.out.println("b2:" + Integer.toBinaryString(b2));
		int result = b1 & b2;
		System.out.println("b1&b2:" + Integer.toBinaryString(result));
		result = b1| b2;
		System.out.println("b1|b2:" + Integer.toBinaryString(result));
		result = ~b1;
		System.out.println("~b1:" + Integer.toBinaryString(result));
		
	}
	//비교연산, 논리연산
	private static void logicOper() {
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("a가 b와 같은가?" + (n1 == n2));
		System.out.println("a가 b와 같지 않은가?" + (n1 != n2));
		
		int n3 = 5;
		boolean r1 = n3 > 0;
		boolean r2 = n3 < 10;
		boolean r1andr2 = r1 && r2;
		System.out.println("n3가 0 초과 10 미만 영역에 있는가?"+ r1andr2);
		
		r1 = n3 <= 0;
		r2 = n3 >= 10;
		boolean r1orr2 = r1 || r2;
		System.out.println("n3가 0이하이거나 n3가 10이상의 영역에 있는가?" + r1orr2);
		
		boolean rNot = !(n3 > 0 && n3 < 10);
		System.out.println("논리부정:" + rNot);
	}
	//산술연산
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
