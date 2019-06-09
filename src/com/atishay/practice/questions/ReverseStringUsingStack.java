package com.atishay.practice.questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		String A = "abc";
		Deque<Character> stack = new ArrayDeque<>();
		char[] arr = A.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		StringBuilder s = new StringBuilder();
		while (!stack.isEmpty()) {
			s.append(stack.pop());
		}

		System.out.println(s);
	}
}
