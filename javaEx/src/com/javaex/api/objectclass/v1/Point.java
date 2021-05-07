package com.javaex.api.objectclass.v1;

// 특별히 상속받지 않아도 java.lang.object를 상속받음
// java.lang.object -> 자바 객체의 최상위 클래스
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point(%d, %d)", x, y);
	}
	
}
