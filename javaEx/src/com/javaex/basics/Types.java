package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
	//	integerTypes();
	//	floatTypes();
	//	booleanEx();
	//	charEx();
	//	constantEx();
	//	implicitCasting();
		explicitCasting();
	}
	private static void implicitCasting() {
		//	byte(1) < short(2) < int(4) < long(8)
		//		< float(4) < double(8)
		byte b = 10;	//	1바이트 정수형
		System.out.println("byte:" + b);
		int i = b;		//	4바이트 정수형
		System.out.println("int:" + i);
		long l = i;		//	8바이트 정수형
		System.out.println("long:" + l);
		//	자료의 유실 없음
		float f = l;	//	4바이트 실수형 : 바이트 수는 long보다 작지만 표현 범위가 넓다
		System.out.println("long -> float:" + f);
		double d = f;	//	8바이트 실수형
		System.out.println("float -> double:" + d);
	}
	private static void explicitCasting() {
		byte b;	//	1바이트 정수형
		int i = 2021;	//	4바이트 정수형
		float f = 123.456f;	//	4바이트 실수형
		
		System.out.println(Integer.toBinaryString(i));
		
		b = (byte)i;	//	강제로 캐스팅
		System.out.println("int " + i + " -> byte " + b);
		
		i = (int)f;
		System.out.println("float " + f + " -> int " + i);
	}
	private static void constantEx() {
		float PI = 3.14159F;
		final int SPEED_LIMIT = 110;
		System.out.println("PI :" + PI);
		System.out.println("SPEED_LIMIT :" + SPEED_LIMIT);
		
		int speed = 105;
		
		boolean overspeed = speed > SPEED_LIMIT;
		System.out.println("과속은 했는가?" + overspeed);
		
	//	SPEED_LIMIT = 80;
		
		overspeed = speed > SPEED_LIMIT;
		System.out.println("과속은 했는가?" + overspeed);
		
	}
	private static void charEx() {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);
	}
	private static void booleanEx() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1-->" + b1);
		System.out.println("b2-->" + b2);
	}
	private static void floatTypes() {
		float floatVar = 3.12345f;
		double doubleVar = 3.12345;
		
		System.out.println("floatVar:" + floatVar);
		System.out.println("doubleVar:" + doubleVar);
		
		int intVar = 3000000;
		floatVar = 3E6F;
		doubleVar = 3E-6;
		
		
	}
	private static void integerTypes(){
		int intVar1;
		int intVar2;
		intVar1 = 2021;
		//intVar2 = 12351521231;
		
		System.out.println(intVar1);
		long longVar1;
		long longVar2;
		
		longVar1 = 2021;
		longVar2 = 12345678901234L;
		
		System.out.println("longVar1 :" + longVar1);
		System.out.println("longVar2 :" + longVar2);
		
		int bin = 0b1101;
		int oct = 072;
		int hex = 0xFF;
		
		System.out.println("0b1101 ->" +  bin);
		System.out.println("072 ->" +  oct);
		System.out.println("0xFF ->" +  hex);
		
	}

}
