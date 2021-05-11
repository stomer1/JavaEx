package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// 선언
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		// 객체 추가
		lst.add("Java");
		lst.add("c");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println(lst);
		
		// 객체의 삽입(중간에 객체에 삽입)
		lst.add(2, "C#");
		
		lst.add("Java");
		System.out.println(lst);
		
		// 요소의  갯수 확인
		System.out.println("요소의 갯수: " + lst.size());
		
		// 요소의 삭제
		lst.remove(2);
		// 객체의 삭제 : 주어진 객체 값으로 삭제
		lst.remove("Python");
		
		System.out.println(lst);
		
		//TODO: 루프
		// List, Set -> Iterator 이용
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		// 비워보기
		lst.clear();
		System.out.println(lst);

	}

}
