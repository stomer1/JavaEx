package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();

	}
	private static void stringBasic() {
		
		String str;
		str = "Java";
		String str2 ="Java";
		String str3 = new String("Java");
		
		System.out.println("str == str2 ?" + (str == str2));
		
		System.out.println("str == str3 ?" + (str == str3));
		
		System.out.println("str과 str2가 내용이 같은가? " + str.equals(str2));
		System.out.println("str과 str3가 내용이 같은가? " + str.equals(str3));
	}
}
