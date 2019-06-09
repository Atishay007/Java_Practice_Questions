package com.atishay.practice.questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class GenerateAllParenthesesStack {
	public static void main(String[] args) {
		String A = "])";
		char arr[] = A.toCharArray();
		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				stack.push(arr[i]);
			} else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
				if (stack.isEmpty()) {
					System.out.println(0);
					System.exit(0);
				}
				// The difference between brackets can be 1,2.
				// Between () there is 1 diff.
				// Between {} and [] there is gap of 2.
				int diff = Math.subtractExact(arr[i], stack.peek());
				if (!(diff >= 1 && diff <= 2)) {
					System.out.println(0);
				} else {
					stack.pop();
				}
			}
		}

		System.out.println(stack.size() > 0 ? 0 : 1);

	}
}
