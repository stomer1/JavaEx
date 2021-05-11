package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
//		usefulMethods();
//		StringBufferEx();

	}
	// 문자열 객체 : 연결, 메서드 수행시 매번 새 String 반환
	//	StringBuffer : 버퍼 기반으로 작동
	private static void StringBufferEx() {
		// 버퍼 생성
		StringBuffer sb = new StringBuffer("This");
		
		// 문자열 추가 : append
		sb.append(" is pencil");
		// 문자열 삽입 : insert
		sb.insert(8, "my");
		// 문자열 치환 : replace
		sb.replace(8, 10, "your ");
		
		System.out.println(sb);
		// 버퍼 사이즈 변경
		sb.setLength(10);
		System.out.println(sb);
		
		// StringBuffer의 메서드들은 연속해서 호출 -> 메서드 체이닝
		
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil").insert(8, "my")
				.replace(8, 10, "your ");
		String s = sb2.toString();
		
		System.out.println("결과:"  + s);
	}
	private static void stringBasic() {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		System.out.println("s1 == s2 ?" + (s1 == s2));
		System.out.println("s1 == s3 ?" + (s1 == s3));
		
		// valueOf() 메서드 : 기본타입 -> 문자열로 리턴
		String s4 = String.valueOf(Math.PI);
		System.out.println("valueOf 메서드 :" + s4);
		
	}
	private static void usefulMethods() {
		String str = "Java Programming JavaScript Programming";
		
		System.out.println("LENGTH:" + str.length());
		System.out.println("5번 인덱스의 글자:" +  str.charAt(5));
		
		System.out.println("소문자 변환:" + str.toLowerCase());
		System.out.println("대문자 변환:" + str.toUpperCase());
		
		// 검색
		int idx;
		idx = str.indexOf("Java");
		System.out.println("1번째 검색:" +idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("2번째 검색:" +idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("3번째 검색:" +idx);
		
		// 역방향 검색
		System.out.println("역번째 검색:" + str.lastIndexOf("Java"));
		
		// 문자열 추출
		System.out.println("substring:" + str.substring(5));
		System.out.println("substring:" + str.substring(5, 16));
		
		// 치환
		System.out.println("replace:" + str.replaceAll("Java", "java"));
		
		// 공백문자 제거
		String s2 = "            Hello       ";
		String s3 = "             ,  Java          ";
		
		System.out.println(s2.trim() + s3.trim());
		
		// 문자열 분할: split
		String[] chunks = str.split(" ");
		for (String chunk: chunks) {
			System.out.println("WORD:" + chunk);
		
		}
		
		// 문자열 비교: Unicode 비교
		// 같으면 0, 앞의 것이 작으면 음수, 앞의 것이 크면 양수
		System.out.println("ABC".compareTo("ABD"));
		
		
	}

}
