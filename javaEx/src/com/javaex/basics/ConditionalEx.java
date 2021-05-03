package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		ifElseEx3();
//		switchEx();
//		switchEx2();
		switchEx3();
	}
	private static void switchEx3() {
		String day = "MONDAY";
		String act = "";
		
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNSDAY":
		case "THURSDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "불금";
			break;
		case "SATURDAY":
			act = "주말";
			break;
		case "SUNDAY":
			act = "휴식";
			break;
		default:
			act = "?";
		}
		System.out.println(day + "에는 " + act);
	}
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력: ");
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("?");
		}
		scanner.close();
	}
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1. Java, 2. c, 3. c++, 4.파이썬");
		int subject = scanner.nextInt();
		
		switch(subject){
			case 1:
				System.out.println("R101");
				break;
			case 2:
				System.out.println("R202");
				break;
			case 3:
				System.out.println("R303");
				break;
			case 4:
				System.out.println("R404");
				break;
			default:
				System.out.println("관리자에게 문의하세요");
		}
		
		scanner.close();
	}
	private static void ifElseEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1. Java, 2. c, 3. c++, 4.파이썬");
		int subject = scanner.nextInt();
		
		if (subject == 1) {
			System.out.println("R101");
		}else if (subject == 2) {
			System.out.println("R202");
		}else if (subject == 3) {
			System.out.println("R303");
		}else if (subject == 4) {
			System.out.println("R404");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
	}
	private static void ifElseEx2() {
		//정수 입력
		//양수일 때
		//	짝수, 홀수
		//음수일 때 -> 음수
		//0이면 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			if(num %2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			if (num == 0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("음수입니다");
			}
		}
		
		scanner.close();
			
		
	}
	private static void ifElseEx() {
		//정수를 입력 받아서
		// 양수, 음수, 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
			
		}else if (num < 0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다.");
			
		}
		*/
		//중첩 if
		if(num == 0) {
			System.out.println("0입니다");
		}else {
			if(num > 0) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		scanner.close();
	}

}
