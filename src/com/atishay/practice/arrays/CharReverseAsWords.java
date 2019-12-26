package com.atishay.practice.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

//Poor Solution
//O(n): Space Complexity.
//O(n): Runtime complexity.
/*Explanation:
	https://stackoverflow.com/questions/59484131/what-is-the-the-runtime-and-space-complexity-of-this-program/59484533?noredirect=1#comment105147560_59484533
*/
public class CharReverseAsWords {
	public static void main(String[] args) {
		char[] arr = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't',
				'i', 'c', 'e' };
		long startTime = System.currentTimeMillis();

		Deque<String> stk = new ArrayDeque<>();

		StringBuilder strB = new StringBuilder(26);
		for (int i = 0; i < arr.length; i++) { // O(n)
			if (arr[i] != ' ') {
				strB.append(arr[i]);
			} else {
				stk.push(strB.toString()); // O(n): These are parallel calls not nested call.
				stk.push(" ");
				strB = new StringBuilder(26);
			}
		}

		// pushing last string
		stk.push(strB.toString());

		while (!stk.isEmpty()) { // O(n)
			System.out.print(stk.pop());
		}

		System.out.println();
		System.out.println(System.currentTimeMillis() - startTime + " ms");
	}
}
