package com.javaex.jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {

	public static void main(String[] args) {
//		selectAll();
//		insertAuthor();
//		updateAuthor();
//		deleteAuthor();
//		searchAuthor();
		getAuthorInfo();
	}
	private static void getAuthorInfo() {
		selectAll();
		// 스캐너로부터 PK 입력 받아 저자 정보 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("저자 아이디:");
		int id = scanner.nextInt();
		AuthorDAO dao = new AuthorDAOimpl();
		AuthorVO vo = dao.get(Long.valueOf(id));
		
		if(vo != null) {
			System.out.printf("%d\t%s\t%s%n",
					vo.getId(), vo.getAuthorName(), vo.getAuthorDesc());
			
		}else {
			System.out.println("Not Found");
		}
		scanner.close();
	}
	private static void searchAuthor() {
		// Scanner에서 키워드 입력 -> 부분 검색
		Scanner scanner = new Scanner(System.in);
				selectAll();
				System.out.print("검색어:");
				
				
				AuthorDAO dao = new AuthorDAOimpl();
				String keyword = scanner.next();
				List<AuthorVO> list = dao.search(keyword);
				
				Iterator<AuthorVO> it = list.iterator();
				
				while(it.hasNext()) {
					AuthorVO vo = it.next();
					System.out.printf("%d\t%s\t%s%n",
							vo.getId(),
							vo.getAuthorName(),
							vo.getAuthorDesc());
				}
				scanner.close();
	}
	private static void deleteAuthor() {
		//
		Scanner scanner = new Scanner(System.in);
		selectAll();
		System.out.print("삭제할 저자:");
		int id = scanner.nextInt();
		
		
		AuthorDAO dao = new AuthorDAOimpl();
		boolean success = dao.delete(Long.valueOf(id));
		
		System.out.println("DELETE " + (success ? "성공" : "실패") );
		selectAll();
		scanner.close();
	}
	private static void updateAuthor() {
		Scanner scanner = new Scanner(System.in);
		selectAll();
		System.out.print("수정할 저자:");
		int id = scanner.nextInt();
		System.out.print("수정할 저자 정보:");
		String desc = scanner.next();
		
		AuthorVO vo = new AuthorVO(Long.valueOf(id), null, desc);
		
		AuthorDAO dao = new AuthorDAOimpl();
		boolean success = dao.update(vo);
		
		System.out.println("UPDATE" + (success ? "성공" : "실패"));
		
		selectAll();
	}
	private static void insertAuthor() {
		// Scanner에서 이름 입력 -> INSERT
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("저자 이름:");
		String name = scanner.next();
		
		AuthorVO vo = new AuthorVO(null, name);
		AuthorDAO dao = new AuthorDAOimpl();
		
		boolean success = dao.insert(vo);
		
		System.out.println("INSERT" + (success ? "성공" : "실패") );
		
		selectAll();
		scanner.close();
	}
	private static void selectAll() {
		AuthorDAO dao = new AuthorDAOimpl();
		List<AuthorVO> list = dao.getList();
		
		// Iterator
		Iterator<AuthorVO> it = list.iterator();
		
		System.out.println("========== Author List");
		
		while(it.hasNext()) {
			AuthorVO item = it.next(); // iterator에서 요소 추출
			System.out.printf("%d\t%s\t%s%n",
					item.getId(),
					item.getAuthorName(),
					item.getAuthorDesc());
		}
	}

}
