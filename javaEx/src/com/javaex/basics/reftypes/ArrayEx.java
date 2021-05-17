package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
		multiDimArray();
//		arrayCopyFor();
//		arrayCopySystem();
	}
	private static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 3, source.length);
		
		for ( int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
			
		}
		System.out.println();
		// Enhanced For : 순차 객체로부터 값을 하나씩 추출하여 할당
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
	private static void arrayCopyFor() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for ( int i = 0; i < source.length; i++) {
			
			target[i] = source[i];
			
		}
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] +"\t");
		}
		System.out.println();
	}
	private static void multiDimArray() {
		//2차원 배열 new type[행수][열수]
		//3차원 배열 new type[면][행수][열수]
		int[][] twoDimen = new int[5][10];
		
		int table[][] = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
				{2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
				{3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
				{4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
				{5, 6, 7, 8, 9, 0, 1, 2, 3, 4}
		};
		//배열 내부의 모든 값의 합산
		int total = 0;
		
		System.out.println("table 배열에 행수:" + table.length);
		
		for( int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
	//			System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
			
		}
		System.out.println("총계" + total);
	}
	private static void arrayBasic() {
		//선언과 초기화 사용
		
		String[] names;
		int scores[];
		
		//초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"전우치",
				"임꺽정"
				
		};
		//배열 생성
		scores = new int[4];
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;  // 인덱스를 벗어난 접근은 에러
		
		//값 목록이 있는 경우
		float heights[] = {
			175.3f,
			178.2f,
			165.3f,
			188
		};
		for (int i = 0; i < scores.length; i++) {
		System.out.printf("%s (%.2f) : score = %d%n", 
				names[i],
				heights[i],
				scores[i]);
		}
		int scores2[] = scores;
		System.out.println("socres == socres2:" + (scores == scores2));
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		scores2[2] = 100;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
	}

}
