package com.atishay.practice.questions;

import java.util.ArrayDeque;
import java.util.Deque;

//Using ArrayDeque for Queue
//Rule: FIFO (First In First Out.)
public class ArrayDequeWithQueue {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();

		//Use offer method to put element in the end of the queue.
		queue.offer(10);
		queue.offer(0);
		queue.offer(20);
		queue.offer(30);

		System.out.println(queue);
		// popping out
		queue.pop();
		System.out.println("***After pop***");
		System.out.println(queue);

	}
}
