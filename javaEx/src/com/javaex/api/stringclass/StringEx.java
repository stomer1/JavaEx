package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
		

	}
	private static void stringBasic() {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		System.out.println("s1 == s2 ?" + (s1 == s2));
		System.out.println("s1 == s3 ?" + (s1 == s3));
	}

}
