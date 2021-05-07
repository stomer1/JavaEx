package com.javaex.oop.summary;

// 상속(extends)는 오로지 한 부모로 부터
// 구현(implments)는 여러개의 인터페이스 가능
public class KungFuPanda extends Panda implements KungFuSkill {
	/*
	// 1. 생성자 선언 안하면 -> 기본 생성자 추가
	public KungFuPanda() {
		// 2. 특별히 명시하지 않으면 부모의 기본생성자를 호출
		super();
	}
	*/
	
	public KungFuPanda(String name, int age) {
		super(name, age);
	}
	@Override
	public void kungFu() {
		System.out.printf("%s: 야뵤~!%n", name);

	}

	

}