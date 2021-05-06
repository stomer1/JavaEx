package com.javaex.basics;

public class practice {

	public static void main(String[] args) {
		arrayCopySystem();
		multiDimArray();
		//problem01
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int total = 0;
		int num = 0;
		for (int i = 0; i < data.length;  i++) {
			System.out.println(data[i]);
			if(data[i] % 3 == 0) {	
				num++;
				System.out.println("3배수의 개수:" +num);
				total += data[i];
				
				
			}
			
			System.out.println("3배수의 합: " + total);
		}
		//problem02
		int total1 = 0;
		float avg = 0;
		
		int data2[] = {10, 20, 30, 40, 50};
		for (int i = 0; i < data2.length; i++) {
			total1 += data2[i];
			avg = (total1/5);
		}
		System.out.println("총합: " + total1);
		System.out.println("평균: " +avg);
		
		//problem04
		
		
		for (int i = 0; i <= 5; i++) {
			int random = (int)(Math.random()*45)+1;
			System.out.print(random + " ");
			}
	}
		//problem03
		private static void arrayCopySystem() {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ',  'p', 'e', 'n', 'c', 'i', 'l'};
		char target[] = new char[16];
		
		System.arraycopy(c, 0, target, 0, c.length);
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]);
		}
		System.out.println();
		char c1[] = {'T', 'h', 'i', 's', ',', 'i', 's', ',', 'a', ',',  'p', 'e', 'n', 'c', 'i', 'l'};
		char target1[] = new char[16];
		
		System.arraycopy(c1, 0, target1, 0, c1.length);
		
		for (int i = 0; i < target1.length; i++) {
			System.out.print(target1[i]);
		}
		System.out.println();
		}
		private static void multiDimArray() {
			int[][] twoDimen = new int[5][5];
			
			int scoreboard[][] = {
					{80, 75, 90, 95, 78 },
					{92, 88, 89, 92, 70 },
					{78, 80, 85, 86, 63 },
					{83, 84, 89, 87, 75 },
					{89, 83, 93, 94, 78 }
			};
			int total3 = 0;
			int count = 0;
			int avg1 = 0;
			for(int row = 0; row < scoreboard.length; row++) {
				for(int col = 0; col < scoreboard[row].length; col++) {
					System.out.print(scoreboard[row][col] + "\t");
					
					if(scoreboard[row][col] >= 85) {
						total3 += scoreboard[row][col];
						count++;
					//	avg1 = total3 / count); 
					//	System.out.print(scoreboard[row][col]);
					//	System.out.println(total3);
					//	System.out.println(avg1);
						
					}
					
				}
				System.out.println();
			}
		}
		
		
	}
	

