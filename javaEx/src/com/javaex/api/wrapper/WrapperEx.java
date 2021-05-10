package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본 생성 -> 더이상 사용 안함(Deprecated)
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		// valueOf 메서드를 생성 (이 방법을 쓰자)
		Float f = Float.valueOf(3.14159f);
		Integer i1 = Integer.valueOf("2021");
		Double d1 = Double.valueOf(3.14159);
		// 주의 매개 변수 문자열의 형태가 기본 타입의 형태를 맞춰야 한다
		
		// 자동 박싱
		Integer i2 = 2021;
		// parse계열 메서드
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Integer.toBinaryString(2021));
		System.out.println(Integer.toHexString(255));
		
		// 형변환
		System.out.println(i2.doubleValue());
		
		Integer i3 = Integer.valueOf(2021);
		Integer i4 = Integer.valueOf(2021);
		
		System.out.println("i3 == i4 ? " + (i3 == i4));
		// 언박싱 비교
		System.out.println("값의 비교(언박싱) :" + (i3.intValue() == i4.intValue()));
		// equal 비교
		System.out.println("값의 비교(equal)" + i3.equals(i4));
	}

}
