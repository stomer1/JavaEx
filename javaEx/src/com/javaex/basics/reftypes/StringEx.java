package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		stringFormatEx();
	}
	private static void stringFormatEx() {
		//형식화된 문자열
		//%s(문자열), %d(정수), %f(실수), %(개형), %%(%)
		String food = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + food + "중에서 " + eat + "개를 먹었다" );
		
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n ", total, food, eat);
		
		float rate = 1.234f;
		
		System.out.printf("현재 이자율은 %f%%입니다%n", rate);
		System.out.printf("현재 이자율은 %.3f%%입니다", rate);
		
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n"; 
		String result = String.format(fmt, 5, "바나나", 2);
		System.out.println(result);
		
	}
	private static void stringBasic() {
		
		String str;
		str = "Java";
		String str2 ="Java";
		String str3 = new String("Java");
		
		System.out.println("str == str2 ?" + (str == str2));
		
		System.out.println("str == str3 ?" + (str == str3));
		
		System.out.println("str과 str2가 내용이 같은가? " + str.equals(str2));
		System.out.println("str과 str3가 내용이 같은가? " + str.equals(str3));
	}
}
