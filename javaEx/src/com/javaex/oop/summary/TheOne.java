package com.javaex.oop.summary;

// 인터페이스는 여러개 구현 가능
public class TheOne extends Human implements KungFuSkill, Flyable {
	public TheOne(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.printf("%s: I believe I can fly!%n", name);

	}

	@Override
	public void kungFu() {
		System.out.printf("%s: I know KungFu!%n", name);

	}

}
