package com.atishay.practice.stack;

import java.util.ArrayDeque;
import java.util.Deque;

//Using ArrayDeque for Stack
//Rule: LIFP (Last In First Out.)
public class ArrayDequeWithStack {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();

		// Use offer method to put element in the end of the queue.
		stack.push(10);
		stack.push(0);
		stack.push(20);
		stack.push(30);

		System.out.println(stack);
		// popping out
		stack.pop();
		System.out.println("***After pop***");
		System.out.println(stack);

	}
}
