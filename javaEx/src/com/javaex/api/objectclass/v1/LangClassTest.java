package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		System.out.println("클래스 이름:" + p.getClass().getName());
		System.out.println("객체 식별 정보:" + p.hashCode());
		System.out.println("객체 출력:" + p);
		System.out.println("객체 출력:" + p.toString());
		System.out.println("Point의 부모" + p.getClass()
											.getSuperclass()
											.getName());
	}

}
