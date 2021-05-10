package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 -> 내부 데이터 타입 결정
		Box<Integer> intBox = new Box<>(); // 객체화 할 때 내부 데이터 아입 결정
		intBox.setContent(2021); // intBox.setContent(Integer.valueOf(2021));
//		intBox.setContent("Java"); // 컴파일 타임에 내부데이터 체크해 줄 수 있다 -> 안정성 확보
		// 내용물을 꺼내 봅니다
		
		int reVal = intBox.getContent();
		System.out.println("내용물: " + reVal);
		
		// Box 생성 String 값을 설정
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		// 만약 캐스팅을 잘못 했다면
//		strVal = (String)intBox.getContent();
		
		// 1.캐스팅을 해야하는 불편함
		// 2.캐스팅 오류를 위험을 컴파일 타임에서 체크할 수 있다
		
	}

}
