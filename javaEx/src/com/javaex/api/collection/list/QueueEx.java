package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// 입력 방향과 출력 방향이 반대
	// First Input First Output(FIFO)
	public static void main(String[] args) {
		// 실제 클래스가 없다
		Queue<Integer> queue= new LinkedList<>();
		
		// 데이터 제공
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
			System.out.println("OFFER: " + queue);
		}
		System.out.println("PEEK:" + queue.peek());
		System.out.println("QUEUE: " + queue);
		
		while(!queue.isEmpty()) { // 큐가 비여있지 않으면 인출
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
	}

}
